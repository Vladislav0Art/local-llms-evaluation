package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGetValuesBetween {

    @Test
    public void testGetValuesBetween() {
        DataFrame df = new DataFrame();
        df.insertRow(0, new int[]{1, 2, 3});
        df.insertRow(1, new int[]{4, 5, 6});

        int[] values = df.getValuesInRange(1, 3);

        assertThat(values.length, is(2));
    }

}