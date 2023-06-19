package de.adesso.wickedcharts.highcharts.jackson;

import de.adesso.wickedcharts.highcharts.options.SeriesType;

public class SeriesTypeEnumDeserializer extends LowercaseEnumDeserializer<SeriesType> {

    @Override
    protected Class<SeriesType> getType() {
        return SeriesType.class;
    }
}