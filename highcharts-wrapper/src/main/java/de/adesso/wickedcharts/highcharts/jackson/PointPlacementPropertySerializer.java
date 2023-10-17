package de.adesso.wickedcharts.highcharts.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import de.adesso.wickedcharts.highcharts.options.PointPlacement;
import de.adesso.wickedcharts.highcharts.options.PointPlacementProperty;

import java.io.IOException;

import static java.util.Objects.nonNull;

public class PointPlacementPropertySerializer extends JsonSerializer<PointPlacementProperty> {

    @Override
    public void serialize(PointPlacementProperty pointPlacement, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (nonNull(pointPlacement)) {
            if (pointPlacement.getPlacement().equals(PointPlacement.NUMBER)) {
                jsonGenerator.writeRawValue(pointPlacement.getPosition().toString());
            } else if (pointPlacement.getPlacement().equals(PointPlacement.ON) || pointPlacement.getPlacement().equals(PointPlacement.BETWEEN)) {
                jsonGenerator.writeRawValue(pointPlacement.getPlacement().toString().toLowerCase());
            }
        }
    }
}
