package com.googlecode.wickedcharts.highcharts.options;

public class NavigatorSeries {
    private boolean includeInCSVExport;

    public boolean isIncludeInCSVExport() {
        return includeInCSVExport;
    }

    public NavigatorSeries setIncludeInCSVExport(boolean includeInCSVExport) {
        this.includeInCSVExport = includeInCSVExport;
        return this;
    }
}
