package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGetMax {

    @Test
    public void testGetMax() {
        DataFrame df = new DataFrame();
        df.insertRow(0, Arrays.asList(1, 2, 3));

        Object[] values = (Object[]) df.getValues().toArray();

        int max = Integer.MIN_VALUE;
        for (int i : values) {
            if (i instanceof Integer) {
                max = Math.max(max, ((Integer) i).intValue());
            }
        }

        assertThat(max, is(1));
    }

}