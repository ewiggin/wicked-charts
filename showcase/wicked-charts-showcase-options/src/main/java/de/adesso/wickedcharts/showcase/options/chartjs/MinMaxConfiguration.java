package de.adesso.wickedcharts.showcase.options.chartjs;

import de.adesso.wickedcharts.chartjs.chartoptions.*;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.SimpleColor;
import de.adesso.wickedcharts.chartjs.chartoptions.label.TextLabel;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.IntegerValue;
import de.adesso.wickedcharts.showcase.options.chartjs.base.ShowcaseConfiguration;

import java.util.Arrays;


/**
 * 
 * A sample that shows how to configure min and max Ticks in the chart options.
 *
 * @see <a href="http://www.chartjs.org/samples/latest/scales/linear/min-max.html">http://www.chartjs.org/samples/latest/scales/linear/min-max.html</a>
 *
 * @author SvenWirz
 */
@SuppressWarnings("serial")
public class MinMaxConfiguration extends ShowcaseConfiguration {
	public MinMaxConfiguration() {
		super();
    	setType(ChartType.LINE);
		
		Data data = new Data()
				.setLabels(TextLabel.of("January", "February", "March", "April", "May", "June", "July"));
		setData(data);
		
		Dataset dataset1 = new Dataset()
				.setLabel("My First dataset")
				.setBackgroundColor(SimpleColor.RED)
				.setBorderColor(SimpleColor.RED)
				.setData(IntegerValue.of(Arrays.asList(10, 30, 39, 20, 25, 34, -10)))
				.setFill(false);
		
		
		Dataset dataset2 = new Dataset()
				.setLabel("My Second dataset")
				.setBackgroundColor(SimpleColor.BLUE)
				.setBorderColor(SimpleColor.BLUE)
				.setData(IntegerValue.of(Arrays.asList(100, 33, 22, 19, 11, 49, 30)))
				.setFill(false);
		
		data.setDatasets(Arrays.asList(dataset1,dataset2));
		
		Options options = new Options()
				.setResponsive(true)
				.setTitle(new Title()
						.setDisplay(true)
						.setText("Min and Max"))
				.setScales(new Scales()
						.setYAxes(new AxesScale()
								.setTicks(new Ticks()
										.setMin(10)
										.setMax(50))))
				;
		setOptions(options);
	}
}
