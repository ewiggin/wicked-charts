package com.googlecode.wickedcharts.highcharts.options;

import java.io.Serializable;

public class Navigator implements Serializable {

    private static final long serialVersionUID = -1431057189677932887L;

    private Boolean adaptToUpdatedData;
    private Boolean enabled;
    private Axis xAxis;
    private NavigatorSeries series;

    public Boolean getAdaptToUpdatedData() {
        return adaptToUpdatedData;
    }

    public Navigator setAdaptToUpdatedData(Boolean adaptToUpdatedData) {
        this.adaptToUpdatedData = adaptToUpdatedData;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public Navigator setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Axis getxAxis() {
        return xAxis;
    }

    public Navigator setxAxis(Axis xAxis) {
        this.xAxis = xAxis;
        return this;
    }

    public NavigatorSeries getSeries() {
        return series;
    }

    public Navigator setSeries(NavigatorSeries series) {
        this.series = series;
        return this;
    }
}
