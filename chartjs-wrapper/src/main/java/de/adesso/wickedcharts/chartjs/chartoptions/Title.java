package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.chartoptions.colors.Color;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.StringValue;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.ValueType;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * Contains attributes for the 'Title' option of a chart
 */

/**
 * Defines the Title attribute of the chart options.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/configuration/title.html">http://www.chartjs.org/docs/latest/configuration/title.html</a>
 *
 * @author SvenWirz
 */
@Accessors(chain = true)
@lombok.Data
public class Title implements Serializable{
	private static final long serialVersionUID = 1L;
	private Boolean display;
	private List<StringValue> text;
	private StringValue labelString;
	private Position position;
	private Integer fontSize;
	private String fontFamily;
	private FontStyle fontStyle;
	private Color fontColor;
	private Integer padding;
	private ValueType lineHeight;
	
	public Title setText(String text) {
		this.text = StringValue.of(text);
		return this;
	}
	
	public Title setText(List<String> text) {
		this.text = StringValue.of(text);
		return this;
	}
}
