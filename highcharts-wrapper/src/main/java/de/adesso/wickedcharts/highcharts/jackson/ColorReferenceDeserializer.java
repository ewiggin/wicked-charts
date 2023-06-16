package de.adesso.wickedcharts.highcharts.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import de.adesso.wickedcharts.highcharts.options.color.ColorReference;
import de.adesso.wickedcharts.highcharts.options.color.HexColor;
import de.adesso.wickedcharts.highcharts.options.color.NullColor;
import de.adesso.wickedcharts.highcharts.options.color.RgbaColor;

import java.io.IOException;

public class ColorReferenceDeserializer extends StdDeserializer<ColorReference> {
    protected ColorReferenceDeserializer(Class<?> vc) {
        super(vc);
    }

    protected ColorReferenceDeserializer() {
        this(null);
    }

    @Override
    public ColorReference deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        String text = node.asText();
        if (text.startsWith("#")) {
            return new HexColor(text);
        } else if (text.startsWith("rgba")) {
            String[] values = text.substring(5, text.length() - 1).split(",");
            Integer red = Integer.parseInt(values[0]);
            Integer green = Integer.parseInt(values[1]);
            Integer blue = Integer.parseInt(values[2]);
            float alpha = values.length > 3 ? Float.parseFloat(values[3]) : 1f;
            return new RgbaColor(red, green, blue, alpha);
        }

        return new NullColor();
    }
}
