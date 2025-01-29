package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestInsertRowAt {

    @Test
    public void testInsertRowAt() {
        DataFrame df = new DataFrame();
        df.insertRow("a", Arrays.asList(1, 2, 3));

        int[] values = (int[]) df.getValues().toArray();

        assertThat(df.getValueAt(0), is(1));
        assertThat(values[0], is(1));
        assertThat(values[1], is(2));
        assertThat(values[2], is(3));
    }

}