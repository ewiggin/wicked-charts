package de.adesso.wickedcharts.highcharts.options.series;

import lombok.NoArgsConstructor;

import java.io.Serial;
import java.util.Arrays;
import java.util.List;

@NoArgsConstructor
public class ArraySeries extends Series<Number[]> {

    @Serial
    private static final long serialVersionUID = 1L;

    public List<Number[]> getData() {
        return super.getData();
    }

    public ArraySeries setData(List<Number[]> data) {
        super.setData(data);
        return this;
    }

    public ArraySeries setData(Number[]... data) {
        super.setData(Arrays.asList(data));
        return this;
    }
}
