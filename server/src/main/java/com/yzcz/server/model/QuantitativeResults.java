package com.yzcz.server.model;

public class QuantitativeResults {
    private String sampleName;

    private String componentName;

    private String calculatedConcentration;

    private String concUnits;

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

    public String getCalculatedConcentration() {
        return calculatedConcentration;
    }

    public void setCalculatedConcentration(String calculatedConcentration) {
        this.calculatedConcentration = calculatedConcentration == null ? null : calculatedConcentration.trim();
    }

    public String getConcUnits() {
        return concUnits;
    }

    public void setConcUnits(String concUnits) {
        this.concUnits = concUnits == null ? null : concUnits.trim();
    }
}