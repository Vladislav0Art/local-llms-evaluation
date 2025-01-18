package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddStringColumnTest {

    @Test
    public void addStringColumnTest() {
        DataFrame dataFrame = new DataFrame("testFrame");
        dataFrame.addStringColumn("newColumn");
        assertEquals("newColumn", dataFrame.getColumnAt(0).getName());
    }

}