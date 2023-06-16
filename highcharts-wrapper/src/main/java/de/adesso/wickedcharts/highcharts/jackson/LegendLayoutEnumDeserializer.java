package de.adesso.wickedcharts.highcharts.jackson;

import de.adesso.wickedcharts.highcharts.options.LegendLayout;

public class LegendLayoutEnumDeserializer extends LowercaseEnumDeserializer<LegendLayout> {

    @Override
    protected Class<LegendLayout> getType() {
        return LegendLayout.class;
    }
}
