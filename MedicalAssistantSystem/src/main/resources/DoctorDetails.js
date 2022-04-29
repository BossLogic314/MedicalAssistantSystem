let url = window.location.href;
let apiPath = 'api/';
let doctorDetailsPath = '/doctorDetails';
let urlWithoutPermalink = null;
let urlString = null;

let xhr = null;

let specializationString = null;

function getUrlWithoutPermalink() {

    var urlComponents = url.split("/");
    var urlComponentsLength = urlComponents.length;

    // Initializing
    urlWithoutPermalink = "";

    // Appending all the components
    for (var i = 0; i < urlComponentsLength - 1; ++i) {
        urlWithoutPermalink += (urlComponents[i] + "/");
    }
}

// To make an API call to get the specialization from the specialization id
function addSpecializationHeading(specializationId) {

    var specialization = "";
    xhr = new XMLHttpRequest();

    var url = urlString + '/getDoctorSpecialization?specializationId=' + specializationId;
    
    // Response of the API call
    xhr.onload = function() {

        // If the response is successfully received
        if (xhr.status == 200 && xhr.responseText != '') {

            specialization = xhr.responseText;
        }
    };

    xhr.open('GET', url, false);
    xhr.send();

    var heading = '<div class="specializationHeading">' + specialization + '</div>';
    $('.information').append(heading);
}

function addDoctorBox(doctor) {

    var url = urlString + '/getDoctorQualifications?doctorId=' + doctor.id;
    var doctorQualifications = null;

    xhr = new XMLHttpRequest();
    
    // Response of the API call
    xhr.onload = function() {

        // If the response is successfully received
        if (xhr.status == 200 && xhr.responseText != '') {

            doctorQualifications = JSON.parse(xhr.responseText);
        }
    };

    xhr.open('GET', url, false);
    xhr.send();

    var len = doctorQualifications.length;

    var credentials = '';

    // Appending all the credentials of the doctor
    for (var i = 0; i < len; ++i) {
        credentials += '<div class="credential">' + (i + 1) + '. ' + doctorQualifications[i].degreeName + ' (' +
            doctorQualifications[i].joiningYear + ' - ' + doctorQualifications[i].graduationYear + ')' + '</div>';
    }

    var doctorBox = '<div class="doctorBox">' +
                        '<div class="left">' +
                            '<div class="id">Id: ' + doctor.id + '</div>' +
                            '<div class="name">Name: ' + doctor.firstName + ' ' + doctor.lastName + '</div>' +
                            '<div class="gender">Gender: ' + doctor.gender + '</div>' +
                            '<div class="age">Age: ' + doctor.age + '</div>' +
                        '</div>' +

                        '<div class="right">' +
                            '<div class="credentials">Credentials:</div>' +
                            credentials +
                        '</div>' +
                    '</div>';
    
    // Appending this information
    $('.information').append(doctorBox);
}

function parseDoctorDetails(responseText) {

    // Parsing the text and getting the list of all doctors
    var doctorsList = JSON.parse(responseText);

    // Number of doctors
    var len = doctorsList.length;

    // If no doctors are in the database
    if (len == 0) {
        return;
    }

    var prevSpecializationId = doctorsList[0].specializationId;
    addSpecializationHeading(prevSpecializationId);
    addDoctorBox(doctorsList[0]);

    // Going over all doctors
    for (var i = 1; i < len; ++i) {

        var currentSpecializationId = doctorsList[i].specializationId;

        // If a new specialization starts
        if (currentSpecializationId != prevSpecializationId) {
            addSpecializationHeading(currentSpecializationId);
        }

        addDoctorBox(doctorsList[i]);

        // Updating the previous specialization id
        prevSpecializationId = currentSpecializationId;
    }
}

$(document).ready(function() {

    // Getting the URL except the permalink
    getUrlWithoutPermalink();

    // The URL to get all the doctors and their details
    //urlString = urlWithoutPermalink + apiPath;
    urlString = 'http://localhost:8080/api';

    xhr = new XMLHttpRequest();
    
    // Response of the API call
    xhr.onload = function() {

        // If the response is successfully received
        if (xhr.status == 200 && xhr.responseText != '') {

            // Calling the function to add all the doctors and their information in the HTML file
            parseDoctorDetails(xhr.responseText);
        }
    };

    xhr.open('GET', urlString + '/doctorDetails', false);
    xhr.send();
});