package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedAddStringColumnTest {

    @Test
    public void addStringColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        DataFrame result = dataFrame.addStringColumn("Column1");
        assertNotNull(result);
        assertTrue(result.hasColumn("Column1"));
    }

}