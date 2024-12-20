/**
 *   Copyright 2012-2019 Wicked Charts (http://github.com/adessoAG/wicked-charts)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package de.adesso.wickedcharts.highcharts.options;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.adesso.wickedcharts.highcharts.options.color.ColorReference;
import de.adesso.wickedcharts.highcharts.options.color.SimpleColor;

import java.awt.*;
import java.io.Serializable;

/**
 * Defines the configuration of the "dataLabels" option.
 *
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 *
 * @see <a href="http://api.highcharts.com/highcharts#plotOptions.column.dataLabels">http://api.highcharts.com/highcharts#plotOptions.column.dataLabels</a>
 *
 */
public class DataLabels implements Serializable {

    private static final long serialVersionUID = 1L;

    private HorizontalAlignment align;

    private ColorReference backgroundColor;

    private ColorReference borderColor;

    private Integer borderRadius;

    private Integer borderWidth;

    private ColorReference color;

    private Boolean enabled;

    private Function formatter;

    private String format;

    private Overflow overflow;

    private Integer padding;

    private Integer rotation;

    private Boolean shadow;

    private CssStyle style;

    private Integer x;

    private Integer y;

    private Integer distance;

    private ColorReference connectorColor;

    private Boolean softConnector;

    public DataLabels() {

    }

    public DataLabels(final Boolean enabled) {
        this.enabled = enabled;
    }

    public HorizontalAlignment getAlign() {
        return this.align;
    }

    public ColorReference getBackgroundColor() {
        return this.backgroundColor;
    }

    public ColorReference getBorderColor() {
        return this.borderColor;
    }

    public Integer getBorderRadius() {
        return this.borderRadius;
    }

    public ColorReference getColor() {
        return this.color;
    }

    public ColorReference getConnectorColor() {
        return this.connectorColor;
    }

    public Integer getDistance() {
        return this.distance;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public Function getFormatter() {
        return this.formatter;
    }

    public String getFormat() {
        return this.format;
    }

    public Overflow getOverflow() {
        return this.overflow;
    }

    public Integer getPadding() {
        return this.padding;
    }

    public Integer getRotation() {
        return this.rotation;
    }

    public Boolean getShadow() {
        return this.shadow;
    }

    public CssStyle getStyle() {
        return this.style;
    }

    public Integer getBorderWidth() {
        return this.borderWidth;
    }

    public Integer getX() {
        return this.x;
    }

    public Integer getY() {
        return this.y;
    }

    public Boolean getSoftConnector() {
        return this.softConnector;
    }

    public DataLabels setAlign(final HorizontalAlignment align) {
        this.align = align;
        return this;
    }

    @JsonIgnore
    public DataLabels setBackgroundColor(final Color color) {
        this.backgroundColor = new SimpleColor(color);
        return this;
    }

    @JsonProperty
    public DataLabels setBackgroundColor(final ColorReference backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    @JsonIgnore
    public DataLabels setBorderColor(final Color color) {
        this.borderColor = new SimpleColor(color);
        return this;
    }

    @JsonProperty
    public DataLabels setBorderColor(final ColorReference borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public DataLabels setBorderRadius(final Integer borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    @JsonIgnore
    public DataLabels setColor(final Color color) {
        this.color = new SimpleColor(color);
        return this;
    }

    @JsonProperty
    public DataLabels setColor(final ColorReference color) {
        this.color = color;
        return this;
    }

    public DataLabels setConnectorColor(final ColorReference connectorColor) {
        this.connectorColor = connectorColor;
        return this;
    }

    public DataLabels setDistance(final Integer distance) {
        this.distance = distance;
        return this;
    }

    public DataLabels setEnabled(final Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public DataLabels setFormatter(final Function formatter) {
        this.formatter = formatter;
        return this;
    }

    public DataLabels setFormat(final String format) {
        this.format = format;
        return this;
    }

    public DataLabels setOverflow(final Overflow overflow) {
        this.overflow = overflow;
        return this;
    }

    public DataLabels setPadding(final Integer padding) {
        this.padding = padding;
        return this;
    }

    public DataLabels setRotation(final Integer rotation) {
        this.rotation = rotation;
        return this;
    }

    public DataLabels setShadow(final Boolean shadow) {
        this.shadow = shadow;
        return this;
    }

    public DataLabels setStyle(final CssStyle style) {
        this.style = style;
        return this;
    }

    public DataLabels setBorderWidth(final Integer vorderWidth) {
        this.borderWidth = vorderWidth;
        return this;
    }

    public DataLabels setX(final Integer x) {
        this.x = x;
        return this;
    }

    public DataLabels setY(final Integer y) {
        this.y = y;
        return this;
    }

    public DataLabels setSoftConnector(final Boolean value) {
        this.softConnector = value;
        return this;
    }

}
