package com.googlecode.wickedcharts.highcharts.options.series;

import com.googlecode.wickedcharts.highcharts.options.DateTimeLabelFormat;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * Data grouping is the concept of sampling the data values into larger blocks in order to ease readability and increase
 * performance of charts.
 *
 * Highstock by default applies data grouping when the points become closer than a certain pixel value, determined by
 * the groupPixelWidth option.
 *
 * If data grouping is applied, the grouping information of grouped points can be read from the Point.dataGroup.
 * If point options other than the data itself are set, for example name or color or custom properties, the grouping
 * logic doesn't know how to group it. In this case the options of the first point instance are copied over to the group point.
 * This can be altered through a custom approximation callback function.
 *
 * @see <a href="https://api.highcharts.com/highstock/series.area.dataGrouping.approximation">series.area.dataGrouping</a>
 * @author Mario Martínez (https://github.com/ewiggin)
 */
public class DataGrouping implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * The method of approximation inside a group.
     * When for example 30 days are grouped into one month, this determines what value should represent the group.
     * Possible values are "average", "averages", "open", "high", "low", "close" and "sum".
     *
     * For multi-dimensional data, like ranges and OHLC, "averages" will compute the average for each dimension.
     */
    private String approximation;

    private boolean enabled;

    private boolean forced;

    private boolean groupAll;

    private int groupPixelWidth;

    private boolean smoothed;

    private DateTimeLabelFormat dateTimeLabelFormats;

    private ArrayList units;

    /**
     * Constructor with documentation defaults
     */
    public DataGrouping() {
        enabled = true;
        forced = false;
        smoothed = false;
        groupPixelWidth = 2;
        groupAll = false;
    }

    public DataGrouping(String approximation) {
        super();
        this.approximation = approximation;
    }

    public DataGrouping(String approximation, boolean enabled, boolean forced, boolean groupAll, int groupPixelWidth, boolean smoothed, DateTimeLabelFormat dateTimeLabelFormats, ArrayList units) {
        this.approximation = approximation;
        this.enabled = enabled;
        this.forced = forced;
        this.groupAll = groupAll;
        this.groupPixelWidth = groupPixelWidth;
        this.smoothed = smoothed;
        this.dateTimeLabelFormats = dateTimeLabelFormats;
        this.units = units;
    }

    public String getApproximation() {
        return approximation;
    }

    public DataGrouping setApproximation(String approximation) {
        this.approximation = approximation;
        return this;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public DataGrouping setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public boolean isForced() {
        return forced;
    }

    public DataGrouping setForced(boolean forced) {
        this.forced = forced;
        return this;
    }

    public boolean isGroupAll() {
        return groupAll;
    }

    public DataGrouping setGroupAll(boolean groupAll) {
        this.groupAll = groupAll;
        return this;
    }

    public int getGroupPixelWidth() {
        return groupPixelWidth;
    }

    public DataGrouping setGroupPixelWidth(int groupPixelWidth) {
        this.groupPixelWidth = groupPixelWidth;
        return this;
    }

    public boolean isSmoothed() {
        return smoothed;
    }

    public DataGrouping setSmoothed(boolean smoothed) {
        this.smoothed = smoothed;
        return this;
    }

    public DateTimeLabelFormat getDateTimeLabelFormats() {
        return dateTimeLabelFormats;
    }

    public DataGrouping setDateTimeLabelFormats(DateTimeLabelFormat dateTimeLabelFormats) {
        this.dateTimeLabelFormats = dateTimeLabelFormats;
        return this;
    }

    public ArrayList getUnits() {
        return units;
    }

    public DataGrouping setUnits(ArrayList units) {
        this.units = units;
        return this;
    }
}
