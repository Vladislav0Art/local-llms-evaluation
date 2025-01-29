package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGetRowsAt {

    @Test
    public void testGetRowsAt() {
        DataFrame df = new DataFrame();
        df.insertRow(0, new String[]{"a", "b", "c"});
        df.insertRow(1, new String[]{"d", "e", "f"});

        Object[] rows = df.getRowsAt(0);

        assertThat(rows.length, is(2));
    }

}