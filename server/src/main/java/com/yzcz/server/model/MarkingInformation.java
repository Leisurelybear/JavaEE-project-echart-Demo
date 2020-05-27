package com.yzcz.server.model;

public class MarkingInformation {
    private String sampleName;

    private String componentName;

    private String actualConcentration;

    private String concUnits;

    private String area;

    private String accuracy;

    public String getSampleName() {
        return sampleName;
    }

    public void setSampleName(String sampleName) {
        this.sampleName = sampleName == null ? null : sampleName.trim();
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName == null ? null : componentName.trim();
    }

    public String getActualConcentration() {
        return actualConcentration;
    }

    public void setActualConcentration(String actualConcentration) {
        this.actualConcentration = actualConcentration == null ? null : actualConcentration.trim();
    }

    public String getConcUnits() {
        return concUnits;
    }

    public void setConcUnits(String concUnits) {
        this.concUnits = concUnits == null ? null : concUnits.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy == null ? null : accuracy.trim();
    }
}