package de.adesso.wickedcharts.chartjs.jackson.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import de.adesso.wickedcharts.chartjs.chartoptions.colors.RgbaColor;

import java.io.IOException;
import java.util.Locale;

/**
 * Serializes a RgbaColor object to JSON.
 */
public class RgbaColorSerializer extends JsonSerializer<RgbaColor> {

	
	private static final String RGBA = "'rgba(%d,%d,%d,%.2f)'";
	
	@Override
	public void serialize(RgbaColor color, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonProcessingException {
		jgen.writeRawValue(String.format(Locale.ENGLISH, RGBA, color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()));
	}

}
