package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedAddDateColumnTest {

    @Test
    public void addDateColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        DataFrame result = dataFrame.addDateColumn("Column1");
        assertNotNull(result);
        assertTrue(result.hasColumn("Column1"));
    }

}