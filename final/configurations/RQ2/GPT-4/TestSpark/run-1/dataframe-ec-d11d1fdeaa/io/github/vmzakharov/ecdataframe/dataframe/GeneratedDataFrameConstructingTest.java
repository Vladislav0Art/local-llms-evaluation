package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedDataFrameConstructingTest {

    @Test
    public void DataFrameConstructingTest() {
        DataFrame dataFrame = new DataFrame("Test");
        assertNotNull(dataFrame);
    }

}