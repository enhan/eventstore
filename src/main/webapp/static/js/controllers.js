/**
 * Created with IntelliJ IDEA.
 * User: manu
 * Date: 22/12/12
 * Time: 19:08
 * To change this template use File | Settings | File Templates.
 */


function EventListCtrl(){



}

function HomeCtrl(){

}


function EventNewCtrl($scope){
    $scope.timeOptions = ['opt', 'test'];

}

function SignupCtrl($scope, $http){
    $scope.successfullLogin = false;
    $scope.login = function (){
        $http.get('/connect/facebook').success(function(data){
            $scope.successfullLogin = true;
        });
    }
}
