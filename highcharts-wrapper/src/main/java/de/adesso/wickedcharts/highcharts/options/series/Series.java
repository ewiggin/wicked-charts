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
package de.adesso.wickedcharts.highcharts.options.series;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import de.adesso.wickedcharts.highcharts.options.*;
import de.adesso.wickedcharts.highcharts.options.color.ColorReference;
import de.adesso.wickedcharts.highcharts.options.color.SimpleColor;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.io.Serializable;
import java.util.List;
import java.util.*;

/**
 * Defines the configuration of the "series" option.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#series">http://api.highcharts.com/highcharts#series</a>
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.MINIMAL_CLASS, property = "seriesType")
@JsonSubTypes({
		@JsonSubTypes.Type(value = BoxSeries.class, name = ".BoxSeries"),
		@JsonSubTypes.Type(value = BubbleSeries.class, name = ".BubbleSeries"),
		@JsonSubTypes.Type(value = CoordinatesSeries.class, name = ".CoordinatesSeries"),
		@JsonSubTypes.Type(value = Custom3DCoordinateSeries.class, name = ".Custom3DCoordinateSeries"),
		@JsonSubTypes.Type(value = CustomCoordinatesSeries.class, name = ".CustomCoordinatesSeries"),
		@JsonSubTypes.Type(value = PointSeries.class, name = ".PointSeries"),
		@JsonSubTypes.Type(value = RangeSeries.class, name = ".RangeSeries"),
		@JsonSubTypes.Type(value = SimpleSeries.class, name = ".SimpleSeries"),
		@JsonSubTypes.Type(value = ArraySeries.class, name = ".ArraySeries"),
})
@NoArgsConstructor
public abstract class Series<D> implements Serializable {

	private static final long serialVersionUID = 1L;

    private Float pointPadding;

	private String name;

	private SeriesType type;

	private List<D> data;

	private Integer legendIndex;

	private String stack;

	private Integer xAxis;

	private Integer yAxis;

	private String yAxisId;

	private Marker marker;

	private PixelOrPercent size;

	private Boolean showInLegend;

	private DataLabels dataLabels;

	private ColorReference color;

	private ColorReference borderColor;

	private Integer borderWidth;

	private Number lineWidth;

	private Center center;

	private PixelOrPercent innerSize;

	private Number pointInterval;

	private Number pointStart;

	private PointPlacementProperty pointPlacement;

	private Tooltip tooltip;

	private GridLineDashStyle dashStyle;

	private PlotOptionsStateChoice states;

	private Boolean enableMouseTracking;

	private Integer wickedChartsId;

	private DataGrouping dataGrouping;

	private String id;

	private Boolean showInNavigator;

	private Boolean visible;

	private String linkedTo;

	private Float groupPadding;

	private Map<String, Object> customProperties = new HashMap<>();

	/**
	 * Sets the Wicked Charts specific ID for this Point.
	 *
	 * @param wickedChartsId the id
	 */
	public void setWickedChartsId(Integer wickedChartsId) {
		this.wickedChartsId = wickedChartsId;
	}

	/**
	 * Retrieves the Wicked Charts specific ID for this Point.
     *
     * @return the id of this series
	 */
	public Integer getWickedChartsId() {
		return wickedChartsId;
	}

	/**
	 * Adds a point to this series.
	 * 
	 * @param point
	 *          the point to add.
     *
     * @return a Series of points with the new point added to it
	 */
	public Series<D> addPoint(final D point) {
		if (this.data == null) {
			this.data = new ArrayList<D>();
		}
		this.data.add(point);
		return this;
	}

    public Float getPointPadding() {
        return pointPadding;
    }

    public Center getCenter() {
        return this.center;
	}

	public ColorReference getColor() {
		return this.color;
	}

	public ColorReference getBorderColor() { return this.borderColor; }

	public Integer getBorderWidth() { return this.borderWidth; }

	public Number getLineWidth() { return this.lineWidth; }

	public List<D> getData() {
		return this.data;
	}

	public DataLabels getDataLabels() {
		return this.dataLabels;
	}

	public PixelOrPercent getInnerSize() {
		return this.innerSize;
	}

	public Integer getLegendIndex() {
		return this.legendIndex;
	}

	public Marker getMarker() {
		return this.marker;
	}

	public String getName() {
		return this.name;
	}

	public Number getPointInterval() {
		return this.pointInterval;
	}

	public PointPlacementProperty getPointPlacement() {
		return this.pointPlacement;
	}

	public Number getPointStart() {
		return this.pointStart;
	}

	public Boolean getShowInLegend() {
		return this.showInLegend;
	}

	public PixelOrPercent getSize() {
		return this.size;
	}

	public String getStack() {
		return this.stack;
	}

	public SeriesType getType() {
		return this.type;
	}

	public Integer getxAxis() {
		return this.xAxis;
	}

	public Object getyAxis() {

		if (this.yAxisId != null && !this.yAxisId.isEmpty()) {
			return this.yAxisId;
		}

		return this.yAxis;
	}

	public String getLinkedTo() {
		return this.linkedTo;
	}

	public Float getGroupPadding() {
		return this.groupPadding;
	}

    public Series<D> setPointPadding(final Float pointPadding) {
        this.pointPadding = pointPadding;
        return this;
    }

	public Series<D> setCenter(final Center center) {
		this.center = center;
		return this;
	}

	@JsonIgnore
	public Series<D> setColor(final Color color) {
		this.color = new SimpleColor(color);
		return this;
	}

	@JsonProperty
	public Series<D> setColor(final ColorReference color) {
		this.color = color;
		return this;
	}

	@JsonIgnore
	public Series<D> setBorderColor(final Color borderColor) {
		this.borderColor = new SimpleColor(borderColor);
		return this;
	}

	@JsonProperty
	public Series<D> setBorderColor(final ColorReference borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	public Series<D> setBorderWidth(final Integer borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	public Series<D> setLineWidth(final Number lineWidth) {
		this.lineWidth = lineWidth;
		return this;
	}

	@JsonIgnore
	public Series<D> setData(final D... data) {
		this.data = Arrays.asList(data);
		return this;
	}

	@JsonProperty
	public Series<D> setData(final List<D> data) {
		this.data = data;
		return this;
	}

	public Series<D> setDataLabels(final DataLabels dataLabels) {
		this.dataLabels = dataLabels;
		return this;
	}

	public Series<D> setInnerSize(final PixelOrPercent innerSize) {
		this.innerSize = innerSize;
		return this;
	}

	public Series<D> setLegendIndex(final Integer legendIndex) {
		this.legendIndex = legendIndex;
		return this;
	}

	public Series<D> setMarker(final Marker marker) {
		this.marker = marker;
		return this;
	}

	public Series<D> setName(final String name) {
		this.name = name;
		return this;
	}

	public Series<D> setPointInterval(final Number pointInterval) {
		this.pointInterval = pointInterval;
		return this;
	}

	@JsonProperty
	public Series<D> setPointPlacement(final PointPlacementProperty pointPlacement) {
		this.pointPlacement = pointPlacement;
		return this;
	}

	@JsonIgnore
	public Series<D> setPointPlacement(final PointPlacement pointPlacement) {
		PointPlacementProperty property = new PointPlacementProperty();
		property.setPlacement(pointPlacement);
		this.pointPlacement = property;
		return this;
	}

	@JsonIgnore
	public Series<D> setPointPlacement(final Float pointPlacement) {
		PointPlacementProperty property = new PointPlacementProperty();
		property.setPlacement(PointPlacement.NUMBER);
		property.setPosition(pointPlacement);
		this.pointPlacement = property;
		return this;
	}

	public Series<D> setPointStart(final Number pointStart) {
		this.pointStart = pointStart;
		return this;
	}

	public Series<D> setShowInLegend(final Boolean showInLegend) {
		this.showInLegend = showInLegend;
		return this;
	}

	public Series<D> setSize(final PixelOrPercent size) {
		this.size = size;
		return this;
	}

	public Series<D> setStack(final String stack) {
		this.stack = stack;
		return this;
	}

	public Series<D> setType(final SeriesType type) {
		this.type = type;
		return this;
	}

	/*
	 * Zero-based index of the X-Axis this series should be connected to.
     *
	 */
	public Series<D> setxAxis(final Integer xAxis) {
		this.xAxis = xAxis;
		return this;
	}

	/**
	 * Permet un parametre que podra ser <i>Integer</i> i s'assignarà a <i>yAxis</i> o
	 * String i s'assignarà a <i>yAxisId</i>
	 */
	public Series<D> setyAxis(final Object yAxis) {
		if (yAxis instanceof Integer yAxisInteger) {
			this.yAxis = yAxisInteger;
		} else if (yAxis instanceof String yAxisString) {
			this.yAxisId = yAxisString;
		}

		return this;
	}

	public Series<D> setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
		return this;
	}

	public Tooltip getTooltip() {
		return tooltip;
	}

	public Series<D> setDashStyle(GridLineDashStyle dashStyle) {
		this.dashStyle = dashStyle;
		return this;
	}

	public GridLineDashStyle getDashStyle() {
		return dashStyle;
	}

	public Series<D> setStates(PlotOptionsStateChoice states) {
		this.states = states;
		return this;
	}

	public PlotOptionsStateChoice getStates() {
		return states;
	}

	public Series<D> setEnableMouseTracking(Boolean enableMouseTracking) {
		this.enableMouseTracking = enableMouseTracking;
		return this;
	}

	public Boolean getEnableMouseTracking() {
		return enableMouseTracking;
	}

	public DataGrouping getDataGrouping() {
		return dataGrouping;
	}

	public Series<D> setDataGrouping(DataGrouping dataGrouping) {
		this.dataGrouping = dataGrouping;
		return this;
	}

	public String getId() {
		return id;
	}

	public Series<D> setId(String id) {
		this.id = id;
		return this;
	}

	public Boolean getShowInNavigator() {
		return showInNavigator;
	}

	public void setShowInNavigator(Boolean showInNavigator) {
		this.showInNavigator = showInNavigator;
	}

	public Boolean getVisible() {
		return visible;
	}

	public Series setVisible(Boolean visible) {
		this.visible = visible;
		return this;
	}

	public Map<String, Object> getCustomProperties() {
		return customProperties;
	}

	public Series setCustomProperties(Map<String, Object> customProperties) {
		this.customProperties = customProperties;
		return this;
	}

	public Object getCustomProperty(String key) {
		return customProperties.get(key);
	}

	public Series addCustomProperty(String key, Object value) {
		this.customProperties.put(key, value);
		return this;
	}

	public Series<D> setLinkedTo(String linkedTo) {
		this.linkedTo = linkedTo;
		return this;
	}

	public Series<D> setGroupPadding(Float groupPadding) {
		this.groupPadding = groupPadding;
		return this;
	}
}
