app.factory('errorMessageService',['$http', function($http){
        return {
            controllerChangeId: function (id) {
                return $http.get('/service/' + id);
            },
            serviceChangeId: function (id) {
                return $http.get('/service/' + id);
            },
            daoChangeId: function (id) {
                return $http.get('/service/' + id);
            },
            controllerChange: function () {
                return $http.get('/service/');
            }
        };
}])