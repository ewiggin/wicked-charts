/*
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
package de.adesso.wickedcharts.showcase.options.highcharts.base;

import de.adesso.wickedcharts.highcharts.options.*;
import de.adesso.wickedcharts.highcharts.options.color.HexColor;
import de.adesso.wickedcharts.highcharts.options.color.NullColor;
import de.adesso.wickedcharts.highcharts.options.functions.PercentageFormatter;
import de.adesso.wickedcharts.highcharts.options.series.Point;
import de.adesso.wickedcharts.highcharts.options.series.PointSeries;
import de.adesso.wickedcharts.showcase.options.highcharts.base.ShowcaseOptions;

public class BasicPieOptions extends ShowcaseOptions {

  private static final long serialVersionUID = 1L;

  public BasicPieOptions() {

    setChartOptions(new ChartOptions()
        .setPlotBackgroundColor(new NullColor())
        .setPlotBorderWidth(null)
        .setPlotShadow(Boolean.FALSE));

    setTitle(new Title("Browser market shares at a specific website, 2010"));

    setTooltip(new Tooltip()
        .setFormatter(new PercentageFormatter())
        .setPercentageDecimals(1));

    setPlotOptions(new PlotOptionsChoice()
        .setPie(new PlotOptions()
            .setAllowPointSelect(Boolean.TRUE)
            .setCursor(Cursor.POINTER)
            .setDataLabels(new DataLabels()
                .setEnabled(Boolean.TRUE)
                .setColor(new HexColor("#000000"))
                .setConnectorColor(new HexColor("#000000"))
                .setFormatter(new PercentageFormatter()))));

    addSeries(new PointSeries()
        .setType(SeriesType.PIE)
        .setName("Browser share")
        .addPoint(new Point("Firefox", 45.0))
        .addPoint(new Point("IE", 26.8))
        .addPoint(new Point("Chrome", 12.8)
            .setSliced(Boolean.TRUE)
            .setSelected(Boolean.TRUE))
        .addPoint(new Point("Safari", 8.5))
        .addPoint(new Point("Opera", 6.2))
        .addPoint(new Point("Others", 0.7)));

  }

  @Override
  public String getLabel() {
    return "Basic pie";
  }
}
