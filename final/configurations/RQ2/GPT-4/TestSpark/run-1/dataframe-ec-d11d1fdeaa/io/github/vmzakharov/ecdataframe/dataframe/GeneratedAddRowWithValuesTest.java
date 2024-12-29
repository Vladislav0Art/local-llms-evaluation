package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedAddRowWithValuesTest {

    @Test
    public void addRowWithValuesTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("Column1");
        dataFrame.addRow("Value");
        assertEquals(1, dataFrame.rowCount());
    }

}