package de.adesso.wickedcharts.highcharts.options;

import java.io.Serializable;
import java.util.List;

public class RangeSelector implements Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean enabled;
    private Boolean inputEnabled;
    private Number height;
    private CssStyle labelStyle;
    private List<RangeSelectorButton> buttons;

    public Boolean getEnabled() {
        return enabled;
    }

    public RangeSelector setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getInputEnabled() {
        return inputEnabled;
    }

    public RangeSelector setInputEnabled(Boolean inputEnabled) {
        this.inputEnabled = inputEnabled;
        return this;
    }

    public Number getHeight() {
        return height;
    }

    public RangeSelector setHeight(Number height) {
        this.height = height;
        return this;
    }

    public CssStyle getLabelStyle() {
        return labelStyle;
    }

    public RangeSelector setLabelStyle(CssStyle labelStyle) {
        this.labelStyle = labelStyle;
        return this;
    }

    public List<RangeSelectorButton> getButtons() {
        return buttons;
    }

    public RangeSelector setButtons(List<RangeSelectorButton> buttons) {
        this.buttons = buttons;
        return this;
    }
}
