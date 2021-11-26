package de.adesso.wickedcharts.chartjs.chartoptions.colors;

import java.io.Serializable;

/**
 * Defines colors with predefined values.
 *
 * @see <a href="http://www.chartjs.org/docs/latest/general/colors.html">http://www.chartjs.org/docs/latest/general/colors.html</a>
 *
 * @author SvenWirz
 */
public class SimpleColor extends Color implements Serializable {
	

	private Color color;
	
	private Class<? extends Color> colorClass;
	
	private SimpleColor(Color rgbColor, Class<? extends Color> clazz) {
		this.color = rgbColor;
		this.colorClass = clazz;
	}
	
	public Class<? extends Color> getColorClass() {
		return colorClass;
	}

	public void setColorClass(Class<? extends Color> colorClass) {
		this.colorClass = colorClass;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	// Specified Simple Colors

	public static final SimpleColor RED = new SimpleColor(new RgbColor(255,99,132), RgbColor.class);
	public static final SimpleColor GREEN = new SimpleColor(new RgbColor(75,192,192), RgbColor.class);
	public static final SimpleColor BLUE = new SimpleColor(new RgbColor(54,162,235), RgbColor.class);
	public static final SimpleColor ORANGE = new SimpleColor(new RgbColor(255, 159, 64), RgbColor.class);
	public static final SimpleColor YELLOW = new SimpleColor(new RgbColor(255, 205, 86), RgbColor.class);
	public static final SimpleColor PURPLE = new SimpleColor(new RgbColor(153, 102, 255), RgbColor.class);
	public static final SimpleColor GREY = new SimpleColor(new RgbColor(201, 203, 207), RgbColor.class);
	public static final SimpleColor WHITE = new SimpleColor(new RgbColor(255, 255, 255), RgbColor.class);

	public static final SimpleColor RED_TRANSPARENT = new SimpleColor(new RgbaColor(255,99,132,0.5f), RgbaColor.class);
	public static final SimpleColor GREEN_TRANSPARENT = new SimpleColor(new RgbaColor(75,192,192,0.5f), RgbaColor.class);
	public static final SimpleColor BLUE_TRANSPARENT = new SimpleColor(new RgbaColor(54,162,235,0.5f), RgbaColor.class);
	public static final SimpleColor ORANGE_TRANSPARENT = new SimpleColor(new RgbaColor(255, 159, 64, 0.5f), RgbaColor.class);
	public static final SimpleColor YELLOW_TRANSPARENT = new SimpleColor(new RgbaColor(255, 205, 86, 0.5f), RgbaColor.class);
	public static final SimpleColor PURPLE_TRANSPARENT = new SimpleColor(new RgbaColor(153, 102, 255, 0.5f), RgbaColor.class);
	public static final SimpleColor GREY_TRANSPARENT = new SimpleColor(new RgbaColor(201, 203, 207, 0.5f), RgbaColor.class);
	public static final SimpleColor WHITE_TRANSPARENT = new SimpleColor(new RgbaColor(255, 255, 255, 0.5f), RgbaColor.class);
}
