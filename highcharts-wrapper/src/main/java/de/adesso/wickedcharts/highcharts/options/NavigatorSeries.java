package de.adesso.wickedcharts.highcharts.options;

public class NavigatorSeries {
    private boolean includeInCSVExport;
    private boolean includeInDataExport;

    public boolean isIncludeInCSVExport() {
        return includeInCSVExport;
    }

    public NavigatorSeries setIncludeInCSVExport(boolean includeInCSVExport) {
        this.includeInCSVExport = includeInCSVExport;
        return this;
    }

    public boolean isIncludeInDataExport() {
        return includeInDataExport;
    }

    public NavigatorSeries setIncludeInDataExport(boolean includeInDataExport) {
        this.includeInDataExport = includeInDataExport;
        return this;
    }
}