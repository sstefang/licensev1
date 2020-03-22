$.ajax({
    url: 'linechartdata',
    success: function (result) {
        var time = JSON.parse(result).time;
        var temperature = JSON.parse(result).temperature;

        drawLineChart(time, temperature);

    }
})

function drawLineChart(time, temperature) {
  chart =  Highcharts.chart('container', {
        chart: {
            title: 'time/temperature',
            type: 'line',
            width: 500
        },
        xAxis: {
            title: "Time (s)",
            categories: time
        },
        tooltip: {
            formatter: function () {
                console.log(this);
            }
        },
        series: [{
            data: temperature
        }]
    });

    chart.setTitle({text: "A new title"});
    chart.xAxis[0].update({
        title:{
            text: "Time"
        }
    });
    chart.yAxis[0].update({
        title:{
            text: "Temperature"
        }
    });

}



