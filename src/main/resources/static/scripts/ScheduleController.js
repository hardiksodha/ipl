var scheduleCtrlFunction = function (dataService) {

    var vm = this;
    vm.myText = "I am in schedule controller";
    vm.selectedTeam = [];
    dataService.getSchedule()
        .then(getScheduleSuccess)
        .catch(errorCallback);

    function getScheduleSuccess(schedule) {
        vm.scheduleList = schedule._embedded.schedule;
    }

    function getAllReadersComplete() {
        //console.log('getAllReaders has completed');
    }

    function errorCallback(errorMsg) {
        // console.log('Error Message: ' + errorMsg);
    }

    vm.getSelectedTeamNames = function(){
        alert(vm.selectedTeam);
    }



};
/**
 * Created by Hardik on 22-03-2017.
 */


myApp.controller('scheduleController',['dataService', scheduleCtrlFunction])