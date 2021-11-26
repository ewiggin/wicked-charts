/*
 * Copyright 2012-2019 Wicked Charts (tom.hombergs@gmail.com)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package de.adesso.wickedcharts.highcharts.jackson;

import de.adesso.wickedcharts.highcharts.options.DateTimeLabelFormat;
import de.adesso.wickedcharts.highcharts.options.DateTimeLabelFormat.DateTimeProperties;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Ignore;

/**
 *
 * @author Matthias Balke (matthias.balke@gmail.com)
 *
 */
public class DateTimeLabelFormatTest {

	@Test
	void testOneProperty() {
		// given
		DateTimeLabelFormat dateTimeLabelFormat = new DateTimeLabelFormat();
		dateTimeLabelFormat.setProperty(DateTimeProperties.SECOND, "%e. %b");
		JsonRenderer renderer = new JsonRenderer();

		// when
		String json = renderer.toJson(dateTimeLabelFormat);

		// then
		assertEquals("{\"second\": \"%e. %b\" }", json);
	}

	@Ignore("order of keys is not predictable in JSON")
	@Test
	public void testMoreProperties() {
		// given
		DateTimeLabelFormat dateTimeLabelFormat = new DateTimeLabelFormat();
		dateTimeLabelFormat.setProperty(DateTimeProperties.SECOND, "%H:%M:%S");
		dateTimeLabelFormat.setProperty(DateTimeProperties.MINUTE, "%H:%M");
		dateTimeLabelFormat.setProperty(DateTimeProperties.HOUR, "%H:%M");
		dateTimeLabelFormat.setProperty(DateTimeProperties.DAY, "%e. %b");
		dateTimeLabelFormat.setProperty(DateTimeProperties.WEEK, "%e. %b");
		dateTimeLabelFormat.setProperty(DateTimeProperties.MONTH, "%b '%y");
		dateTimeLabelFormat.setProperty(DateTimeProperties.YEAR, "%Y");

		JsonRenderer renderer = new JsonRenderer();

		// when
		String json = renderer.toJson(dateTimeLabelFormat);

		// then
		assertEquals(
				"{ \"week\": \"%e. %b\", \"hour\": \"%H:%M\", \"minute\": \"%H:%M\", \"year\": \"%Y\", \"month\": \"%b \'%y\", \"day\": \"%e. %b\", \"second\": \"%H:%M:%S\" }",
				json);

	}

}