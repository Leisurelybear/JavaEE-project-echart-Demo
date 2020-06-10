
//图表1
if ($('#ambarchart1').length) {
    mkChart_1("")

}
function mkChart_1(componentName) {
    console.log(componentName)
    if (componentName == null || componentName == "") {
        componentName = "Ethylenediamine"
    }
    dat = []
    $("#c_name_01").html(componentName)
    $("#c_name_01_1").html(componentName)

    $.ajax({

        url: "http://localhost:8080/quantitative/querybyname",
        dataType: "text json",
        data:"componentName=" + componentName,
        type: "post",
        async:false,
        statusCode: {
            200: function (data) {
                $(data).each(function (i, v) {
                    dat.push({
                        "sampleName": v.sampleName,
                        "concUnits" : v.concUnits,
                        "componentName" : v.componentName,
                        "calculatedConcentration": v.calculatedConcentration,
                        "color": "#7474F0"
                    })
                })
            }
        }
    })

    var chart = AmCharts.makeChart("ambarchart1", {
        "theme": "light",
        "type": "serial",
        "balloon": {
            "adjustBorderColor": false,
            "horizontalPadding": 10,
            "verticalPadding": 4,
            "color": "#fff"
        },
        "dataProvider": dat,
        "valueAxes": [{
            "unit": "ng",
            "position": "left",
        }],
        "startDuration": 3,
        "graphs": [{
            "balloonText": " name: [[category]] <br/> val: <b> [[value]] </b> ",
            "fillAlphas": 0.9,
            "fillColorsField": "color",
            "lineAlpha": 0.2,
            "title": "componentName",
            "type": "column",
            "clustered": false,
            "columnWidth": 0.3,
            "valueField": "calculatedConcentration"
        }],
        "plotAreaFillAlphas": 0.1,
        "categoryField": "sampleName",
        "categoryAxis": {
            "gridPosition": "start"
        },
        "export": {
            "enabled": false
        }

    });
}




//图表2
mkChart_2("")
function mkChart_2(componentName) {

    if (componentName == null || componentName == "") {
        componentName = "Ethylenediamine"
    }
    dat = []

    $("#c_name_02").html(componentName)
    $("#c_name_02_2").html(componentName)

    $.ajax({

        url: "http://localhost:8080/marking/querybyname",
        dataType: "text json",
        data:"componentName=" + componentName,
        type: "post",
        async: false,
        statusCode: {
            200: function (data) {
                console.log(data)
                $(data).each(function (i, v) {
                    dat.push({
                        "key": v.actualConcentration + " " + v.concUnits,
                        "accuracy": v.accuracy
                    })
                })
            }
        }
    })

    if ($('#amlinechart5').length) {
        var chart = AmCharts.makeChart("amlinechart5", {
            "type": "serial",
            "theme": "light",
            "marginRight": 20,
            "marginTop": 17,
            "autoMarginOffset": 20,
            "dataProvider":dat
            /*[
                {
                    "date": "2012-03-01",
                    "price": 20
                }
            ]*/,
            "valueAxes": [{
                "logarithmic": true,
                "dashLength": 1,
                "guides": [{
                    "dashLength": 6,
                    "inside": true,
                    "label": "average",
                    "lineAlpha": 1,
                    "value": 90.4
                }],
                "position": "left"
            }],
            "graphs": [{
                "bullet": "round",
                "id": "g1",
                "bulletBorderAlpha": 1,
                "bulletColor": "#FFFFFF",
                "bulletSize": 7,
                "lineThickness": 2,
                "title": "accuracy",
                "type": "smoothedLine",
                "useLineColorForBulletBorder": true,
                "valueField": "accuracy"
            }],
            "chartScrollbar": {},
            "chartCursor": {
                "valueLineEnabled": true,
                "valueLineBalloonEnabled": true,
                "valueLineAlpha": 0.5,
                "fullWidth": true,
                "cursorAlpha": 0.05
            },
            // "dataDateFormat": "YYYY-MM-DD",
            "categoryField": "key",
            "categoryAxis": {
                "parseDates": false
            },
            "export": {
                "enabled": false
            }
        });

        chart.addListener("dataUpdated", zoomChart);

        function zoomChart() {
            chart.zoomToDates(new Date(2012, 2, 2), new Date(2012, 2, 10));
        }
    }
}


