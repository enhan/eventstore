/**
 * Created with IntelliJ IDEA.
 * User: manu
 * Date: 22/12/12
 * Time: 19:05
 * To change this template use File | Settings | File Templates.
 */

angular.module('eventstore',[]).
    config(['$routeProvider', function($routeProvider){
    $routeProvider.
        when('/events',{templateUrl:'partials/event-list.html', controller: EventListCtrl}).
        when('/events/new', {templateUrl:'partials/event-new.html', controller:EventNewCtrl}).
        when('/', {templateUrl:'partials/home.html', controller:HomeCtrl}).
        otherwise({redirectTo:'/'});

}]);