
package de.adesso.wickedcharts.showcase.options.chartjs.legendposition;

import de.adesso.wickedcharts.chartjs.chartoptions.Legend;
import de.adesso.wickedcharts.chartjs.chartoptions.Position;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;

/**
 * Shows how to configure a chart with the legend position at the top
 *
 * @see <a href="http://www.chartjs.org/samples/latest/legend/positioning.html">http://www.chartjs.org/samples/latest/legend/positioning.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class LegendPositionTopConfiguration extends LegendPositionChartBasicConfiguration {
	
	public LegendPositionTopConfiguration() {
		super();
		
		getData().getDatasets().get(0).setBackgroundColor(SimpleColor.RED_TRANSPARENT)
		.setBorderColor(SimpleColor.RED);
		
		getOptions().setLegend(new Legend().setPosition(Position.TOP));
		
		getOptions().getTitle().setText("Legend Position: Top");
	}
}

