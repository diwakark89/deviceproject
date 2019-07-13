<!DOCTYPE HTML>
<html>
<head>
<script>
$(document).ready(function () {
	$.get("http://localhost:8080/getDevices", function(data, status){
		var options = {
				animationEnabled: true,
				theme: "light2",
				title:{
					text: "Threshold"
				},
				axisX:{
					valueFormatString: "DD MMM"
				},
				axisY: {
					title: "Number of Sales",
					suffix: "K",
					minimum: 30
				},
				toolTip:{
					shared:true
				},  
				legend:{
					cursor:"pointer",
					verticalAlign: "bottom",
					horizontalAlign: "left",
					dockInsidePlotArea: true,
					itemclick: toogleDataSeries
				},
				data: data
			};
		$("#chartContainer").CanvasJSChart(options);
	});
	
});
function toogleDataSeries(e){
	if (typeof(e.dataSeries.visible) === "undefined" || e.dataSeries.visible) {
		e.dataSeries.visible = false;
	} else{
		e.dataSeries.visible = true;
	}
	e.chart.render();
}

window.onload = function () {
	


}
</script>
</head>
<body>
<div id="chartContainer" style="height: 370px; max-width: 920px; margin: 0px auto;"></div>
<script src="https://canvasjs.com/assets/script/jquery-1.11.1.min.js"></script>
<script src="https://canvasjs.com/assets/script/jquery.canvasjs.min.js"></script>
</body>
</html>