package de.adesso.wickedcharts.chartjs.jackson.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import de.adesso.wickedcharts.chartjs.chartoptions.valueType.DoubleValue;

import java.io.IOException;

/**
 * Serializes a DoubleValue object to JSON
 */
public class DoubleValueSerializer extends JsonSerializer<DoubleValue> {

	@Override
	public void serialize(DoubleValue value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException, JsonProcessingException {
		if(value.getValue() != null) {
			gen.writeNumber(value.getValue());
		}
	}

}
