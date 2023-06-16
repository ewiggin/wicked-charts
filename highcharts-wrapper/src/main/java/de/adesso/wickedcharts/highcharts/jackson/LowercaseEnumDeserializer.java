package de.adesso.wickedcharts.highcharts.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

public abstract class LowercaseEnumDeserializer<EnumType extends Enum<EnumType>> extends JsonDeserializer<EnumType> {
    @Override
    public EnumType deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        return Enum.valueOf(getType(), node.asText().toUpperCase());
    }

    protected abstract Class<EnumType> getType();
}