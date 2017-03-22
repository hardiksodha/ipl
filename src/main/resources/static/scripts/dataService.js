/**
 * Created by Hardik on 22-03-2017.
 */

angular.module('myApp')
    .factory('dataService', ['$http',  dataService]);

function dataService($http) {

    return {
        getSchedule : getSchedule
    };  
    
    function getSchedule() {
        return $http({
            method: 'GET',
            url: 'http://localhost:8080/schedule'
        })
            .then(sendResponseData)
            .catch(sendError)
    }

    function sendResponseData(response) {

        return response.data;

    }

    function sendError(response) {

        return $q.reject('Error retrieving schedule(s). (HTTP status: ' + response.status + ')');

    }
}