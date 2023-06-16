package de.adesso.wickedcharts.highcharts.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import de.adesso.wickedcharts.highcharts.options.SeriesType;

import java.io.IOException;

public class SeriesTypeEnumDeserializer extends StdDeserializer<SeriesType> {
    public SeriesTypeEnumDeserializer() {
        this(null);
    }

    public SeriesTypeEnumDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public SeriesType deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        return Enum.valueOf(SeriesType.class, node.asText().toUpperCase());
    }
}
