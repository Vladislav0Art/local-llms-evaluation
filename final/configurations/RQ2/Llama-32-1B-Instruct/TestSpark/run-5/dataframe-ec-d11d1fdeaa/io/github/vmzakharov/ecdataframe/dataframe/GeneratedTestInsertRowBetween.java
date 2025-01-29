package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestInsertRowBetween {

    @Test
    public void testInsertRowBetween() {
        DataFrame df = new DataFrame();
        df.insertRow("a", Arrays.asList(1, 2, 3));

        int[] values = (int[]) df.getValues().toArray();

        for (int i : df.getRowsInRange(1, 3)) {
            assertThat(i, is(1));
            assertThat(values[i], is(1));
        }
    }

}