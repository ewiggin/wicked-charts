package com.googlecode.wickedcharts.highcharts.options;

import java.io.Serializable;

public class ExportingCsv implements Serializable {

    private static final long serialVersionUID = -2957170986754394972L;

    private String dateFormat = "%Y-%m-%d %H:%M:%S";

    public String getDateFormat() {
        return dateFormat;
    }

    public ExportingCsv setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }
}
