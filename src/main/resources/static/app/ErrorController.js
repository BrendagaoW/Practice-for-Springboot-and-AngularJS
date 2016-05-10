var app = angular.module('errorMessage', []);
app.controller('errorMessageCtrl', ['$scope', 'errorMessageService', function ($scope, errorMessageService) {

    $scope.controllerId = 2;
    $scope.controllerSubmit = function (id) {
        errorMessageService.controllerChangeId(id);
    }

    $scope.controllerChange = function () {
        errorMessageService.controllerChange();
    }
}])