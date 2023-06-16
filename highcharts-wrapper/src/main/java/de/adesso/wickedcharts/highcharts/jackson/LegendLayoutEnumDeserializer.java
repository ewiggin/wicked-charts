package de.adesso.wickedcharts.highcharts.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import de.adesso.wickedcharts.highcharts.options.LegendLayout;

import java.io.IOException;

public class LegendLayoutEnumDeserializer extends StdDeserializer<LegendLayout> {

    public LegendLayoutEnumDeserializer() {
        this(null);
    }

    public LegendLayoutEnumDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public LegendLayout deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        return Enum.valueOf(LegendLayout.class, node.asText().toUpperCase());
    }
}
