package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGetMin {

    @Test
    public void testGetMin() {
        DataFrame df = new DataFrame();
        df.insertRow(0, Arrays.asList(1, 2, 3));

        Object[] values = (Object[]) df.getValues().toArray();

        int min = Integer.MAX_VALUE;
        for (int i : values) {
            if (i instanceof Integer) {
                min = Math.min(min, ((Integer) i).intValue());
            }
        }

        assertThat(min, is(1));
    }

}