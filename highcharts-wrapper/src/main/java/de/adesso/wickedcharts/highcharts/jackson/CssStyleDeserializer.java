package de.adesso.wickedcharts.highcharts.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import de.adesso.wickedcharts.highcharts.options.CssStyle;

import java.io.IOException;

public class CssStyleDeserializer extends JsonDeserializer<CssStyle> {
    @Override
    public CssStyle deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        CssStyle style = new CssStyle();
        node.fields().forEachRemaining(stringJsonNodeEntry -> style.setProperty(stringJsonNodeEntry.getKey(), stringJsonNodeEntry.getValue().textValue()));

        return style;
    }
}
