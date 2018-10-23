package com.googlecode.wickedcharts.highcharts.options;

import java.io.Serializable;

public class Navigator implements Serializable {

    private static final long serialVersionUID = -1431057189677932887L;

    private Boolean adaptToUpdatedData;
    private Boolean enabled;
    private Number height;
    private Number margin;
    private String maskFill;
    private Boolean maskInside;
    private Boolean opposite;
    private String outlineColor;
    private Number outlineWidth;

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

    public Number getHeight() {
        return height;
    }

    public Navigator setHeight(Number height) {
        this.height = height;
        return this;
    }

    public Number getMargin() {
        return margin;
    }

    public Navigator setMargin(Number margin) {
        this.margin = margin;
        return this;
    }

    public String getMaskFill() {
        return maskFill;
    }

    public Navigator setMaskFill(String maskFill) {
        this.maskFill = maskFill;
        return this;
    }

    public Boolean getMaskInside() {
        return maskInside;
    }

    public Navigator setMaskInside(Boolean maskInside) {
        this.maskInside = maskInside;
        return this;
    }

    public Boolean getOpposite() {
        return opposite;
    }

    public Navigator setOpposite(Boolean opposite) {
        this.opposite = opposite;
        return this;
    }

    public String getOutlineColor() {
        return outlineColor;
    }

    public Navigator setOutlineColor(String outlineColor) {
        this.outlineColor = outlineColor;
        return this;
    }

    public Number getOutlineWidth() {
        return outlineWidth;
    }

    public Navigator setOutlineWidth(Number outlineWidth) {
        this.outlineWidth = outlineWidth;
        return this;
    }
}
