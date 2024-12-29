package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedAddRowWithoutValuesTest {

    @Test
    public void addRowWithoutValuesTest() {
        DataFrame dataFrame = new DataFrame("Test");
        DataFrame result = dataFrame.addRow();
        assertEquals(1, result.rowCount());
    }

}