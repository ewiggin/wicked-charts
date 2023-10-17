package de.adesso.wickedcharts.highcharts.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import de.adesso.wickedcharts.highcharts.options.PointPlacement;
import de.adesso.wickedcharts.highcharts.options.PointPlacementProperty;

import java.io.IOException;

public class PointPlacementPropertyDeserializer extends JsonDeserializer<PointPlacementProperty> {
    @Override
    public PointPlacementProperty deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        String text = node.asText();
        PointPlacementProperty property = new PointPlacementProperty();

        try {
            Float value = Float.parseFloat(text);
            property.setPlacement(PointPlacement.NUMBER);
            property.setPosition(value);
            return property;
        } catch (Exception e) {
            // No es pot passar a float, es un enum
        }

        if (text.equals("between")) {
            property.setPlacement(PointPlacement.BETWEEN);
            return property;
        }

        if (text.equals("on")) {
            property.setPlacement(PointPlacement.ON);
            return property;
        }

        property.setPlacement(PointPlacement.UNDEFINED);
        return property;
    }
}
