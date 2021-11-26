package de.adesso.wickedcharts.chartjs.chartoptions;

import de.adesso.wickedcharts.chartjs.json.LowercaseEnum;

import java.io.Serializable;

/**
 * Defines all possible positions for tooltips.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/configuration/tooltip.html#position-modes">http://www.chartjs.org/docs/latest/configuration/tooltip.html#position-modes</a>
 */
public enum TooltipPosition implements LowercaseEnum, Serializable {
	NEAREST, AVERAGE;
}
