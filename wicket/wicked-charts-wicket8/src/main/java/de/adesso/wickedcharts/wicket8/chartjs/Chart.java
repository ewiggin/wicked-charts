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
package de.adesso.wickedcharts.wicket8.chartjs;

import de.adesso.wickedcharts.chartjs.ChartConfiguration;
import de.adesso.wickedcharts.wicket8.chartjs.features.basic.ChartBehavior;
import org.apache.wicket.markup.html.WebMarkupContainer;

/**
 * A simple markup container to set up and display a chart.
 *
 *
 * @author SvenWirz
 */
public class Chart extends WebMarkupContainer {

	private static final long serialVersionUID = 1L;

	private ChartConfiguration options;

	public Chart(final String id, final ChartConfiguration options) {
		super(id);
		this.options = options;
		setOutputMarkupId(true);
		add(createChartBehavior());
	}

	public ChartConfiguration getChartConfiguration() {
		return this.options;
	}


	public void setChartConfiguration(final ChartConfiguration options) {
		this.options = options;
	}

	public String getJavaScriptVarName() {
		return this.getMarkupId() + "Var";
	}

	/**
	 * Factory method for {@link ChartBehavior}s. May be overridden, if a custom
	 * implementation of {@link ChartBehavior} is needed.
	 *
	 * @return ChartBehavior object
	 */
	protected ChartBehavior createChartBehavior() {
		return new ChartBehavior(this);
	}

}
