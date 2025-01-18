package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFlaggedTest {

    @Test
    public void isFlaggedTest() {
        DataFrame df = new DataFrame("Test");
        df.addRow();
        assertFalse(df.isFlagged(0));
        df.setFlag(0);
        assertTrue(df.isFlagged(0));
    }

}