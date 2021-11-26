package de.adesso.wickedcharts.chartjs.chartoptions;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import de.adesso.wickedcharts.chartjs.jackson.serializer.SingleElementListSerializer;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * Defines options for the grid lines that run perpendicular to the axis.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/axes/styling.html#grid-line-configuration">http://www.chartjs.org/docs/latest/axes/styling.html#grid-line-configuration</a>
 *
 * @author anedomansky
 * @author maximAtanasov
 */
@SuppressWarnings("serial")
@Accessors(chain = true)
@lombok.Data
public class GridLines implements Serializable {
	private Boolean display;
	private Boolean drawBorder;
	private Boolean drawOnChartArea;
	private Boolean drawTicks;
	@JsonSerialize(using = SingleElementListSerializer.class)
	private List<Color> color;
	private Color zeroLineColor;
	private Boolean offsetGridLines;
	private List<String> borderDash;
	private Number borderDashOffset;
	private Number tickMarkLength;
	private Number zeroLineWidth;
	private List<? extends Number> zeroLineBorderDash;
	private Number zeroLineBorderDashOffset;
	
	@JsonSerialize(using = SingleElementListSerializer.class)
	private List<? extends Number> lineWidth;
	
	public GridLines setLineWidth(Number value) {
		this.lineWidth = Arrays.asList(value);
		return this;
	}
	
	public GridLines setLineWidth(List<? extends Number> list) {
		this.lineWidth = list;
		return this;
	}

	public GridLines setColor(Color color) {
		this.color = Arrays.asList(color);
		return this;
	}
	
	public GridLines setColor(List<Color> color) {
		this.color = color;
		return this;
	}
}
