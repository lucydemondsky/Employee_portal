var app = angular.module('myApp', []);
app.controller('EmployCtrl', function($scope, $http) {

		var url="http://localhost:8080/getlist?sortColumn=name&sortOrder=asc";
    	$http.get(url).then(function(result){
        var json=result.data;
        $scope.employee = json;
     });
    	
    	var c = true;
    	var orderControl = true;
    	var urlString="http://localhost:8080/getlist?sortColumn={{sortColumn}}&sortOrder={{order}}";
    	$scope.request= function(name){   	
		    var order="asc";
		    order != order;
		    var sortColumn="";
		    orderControl = ! orderControl;
		    if(orderControl){
		      order = "asc";
		    }else{
		      order = "desc";
		    }
		    var url= urlString.replace("{{sortColumn}}",name).replace("{{order}}",order);
		    $http.get(url).then(function(result){
		        var json=result.data;
		        $scope.employee = json;
		     });
    	}
    	
    	$scope.query=function(parms){
    		$scope.myVar=true;
    		var url="http://localhost:8080/getEm?name={{parms}}";
    		url=url.replace("{{parms}}",parms);
		    $http.get(url).then(function(result){
		        var json=result.data;
		        $scope.single = json;
		     });
    	}
      	
});
