package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddLongColumnTest {

    @Test
    public void addLongColumnTest() {
        DataFrame dataFrame = new DataFrame("testFrame");
        dataFrame.addLongColumn("newColumn");
        assertEquals("newColumn", dataFrame.getColumnAt(0).getName());
    }

}