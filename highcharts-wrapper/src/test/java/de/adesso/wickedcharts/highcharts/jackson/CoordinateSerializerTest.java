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

import de.adesso.wickedcharts.highcharts.options.series.Coordinate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Matthias Balke (matthias.balke@gmail.com)
 */
class CoordinateSerializerTest {

    @Test
    void testStringFloatCoordinate() {
        // given
        String dateString = "Date.UTC(1970, 9, 27)";
        Coordinate<String, Float> coordinateStringFloat = new Coordinate<String, Float>(
                dateString, 0f);
        JsonRenderer renderer = new JsonRenderer();

        // when
        String json = renderer.toJson(coordinateStringFloat);

        // then
        assertEquals("[" + dateString + ", 0.0]", json);
    }

    @Test
    void testLiteralStringFloatCoordinate() {
        // given
        String anyString = "foo";
        Coordinate<String, Float> coordinateStringFloat = new Coordinate<String, Float>(
                anyString, 0f);
        coordinateStringFloat.setXQuoted(Boolean.TRUE);
        coordinateStringFloat.setYQuoted(Boolean.TRUE);
        JsonRenderer renderer = new JsonRenderer();

        // when
        String json = renderer.toJson(coordinateStringFloat);

        // then
        assertEquals("['" + anyString + "', '0.0']", json);
    }

}
