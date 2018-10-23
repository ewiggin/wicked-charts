package com.googlecode.wickedcharts.highcharts.options;

import java.io.Serializable;

public class ExportingCsv implements Serializable {

    private static final long serialVersionUID = -2957170986754394972L;

    private String dateFormat = "%Y-%m-%d %H:%M:%S";
    private String decimalPoint;
    private String lineDelimiter;
    private String itemDelimiter;

    public String getDateFormat() {
        return dateFormat;
    }

    public ExportingCsv setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    public String getDecimalPoint() {
        return decimalPoint;
    }

    public ExportingCsv setDecimalPoint(String decimalPoint) {
        this.decimalPoint = decimalPoint;
        return this;
    }

    public String getLineDelimiter() {
        return lineDelimiter;
    }

    public ExportingCsv setLineDelimiter(String lineDelimiter) {
        this.lineDelimiter = lineDelimiter;
        return this;
    }

    public String getItemDelimiter() {
        return itemDelimiter;
    }

    public ExportingCsv setItemDelimiter(String itemDelimiter) {
        this.itemDelimiter = itemDelimiter;
        return this;
    }
}
