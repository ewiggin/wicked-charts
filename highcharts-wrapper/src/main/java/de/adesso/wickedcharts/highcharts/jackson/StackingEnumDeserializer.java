package de.adesso.wickedcharts.highcharts.jackson;

import de.adesso.wickedcharts.highcharts.options.Stacking;

public class StackingEnumDeserializer extends LowercaseEnumDeserializer<Stacking> {

    @Override
    protected Class<Stacking> getType() {
        return Stacking.class;
    }
}
