/*
 *   Copyright 2012-2019 Wicked Charts (http://github.com/adessoAG/wicked-charts)
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
package de.adesso.wickedcharts.highcharts.options;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Defines the configuration of the "exporting" option.
 * 
 * @see <a
 *      href="http://api.highcharts.com/highcharts#exporting">http://api.highcharts.com/highcharts#exporting</a>
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
@Accessors(chain = true)
@Data
public class ExportingOptions implements Serializable {

	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private Boolean enabled;

	private Boolean enableImages;

	private String filename;

	private ExportingMimeType type;

	private String url;

	private Integer width;

	private ExportingButtons buttons;

	private CsvOptions csv;

	private Integer printMaxWidth;
}
