package de.adesso.wickedcharts.highcharts.options;

import java.io.Serializable;

public class RangeSelectorButton implements Serializable {

    private static final long serialVersionUID = 234597597621636656L;

    private String type;
    private Number count;
    private String text;

    public String getType() {
        return type;
    }

    public RangeSelectorButton setType(String type) {
        this.type = type;
        return this;
    }

    public Number getCount() {
        return count;
    }

    public RangeSelectorButton setCount(Number count) {
        this.count = count;
        return this;
    }

    public String getText() {
        return text;
    }

    public RangeSelectorButton setText(String text) {
        this.text = text;
        return this;
    }
}
