package de.adesso.wickedcharts.chartjs.chartoptions.fillingmodes;

import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Defines the Filling mode as a relative value.
 * @see <a href="http://www.chartjs.org/docs/latest/charts/area.html">http://www.chartjs.org/docs/latest/charts/area.html</a>
 * @author SvenWirz
 */
@Accessors(chain = true)
@lombok.Data
public class RelativeIndex implements FillingMode, Serializable {
	
	private String index;

	public RelativeIndex(String index) {
		super();
		this.index = index;
	}

	@Override
	public Object getValue() {
		return index;
	}

	@Override
	public Class<?> getReturnType() {
		return String.class;
	}
	
	

}
