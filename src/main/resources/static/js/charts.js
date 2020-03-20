$.ajax({
    url: 'linechartdata',
    success: function (result) {
        var time = JSON.parse(result).time;
        var temperature = JSON.parse(result).temperature;

        drawLineChart(time, temperature);

    }
})

function drawLineChart(time, temperature) {
    Highcharts.chart('container', {
        chart: {
            type: 'line',
            width: 500
        },
        title: {
            text: 'Line chart'
        },
        xAxis: {
            name: "Time (s)",
            categories: time
        },

        yAxis: {
            name: "Temperature (K)"
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

}

