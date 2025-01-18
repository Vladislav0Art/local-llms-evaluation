package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        DataFrame dataFrame = new DataFrame("testFrame");
        assertEquals("testFrame", dataFrame.getName());
    }

    @Test
    public void addStringColumnTest() {
        DataFrame dataFrame = new DataFrame("testFrame");
        dataFrame.addStringColumn("newColumn");
        assertEquals("newColumn", dataFrame.getColumnAt(0).getName());
    }

    @Test
    public void addLongColumnTest() {
        DataFrame dataFrame = new DataFrame("testFrame");
        dataFrame.addLongColumn("newColumn");
        assertEquals("newColumn", dataFrame.getColumnAt(0).getName());
    }

    @Test
    public void addDoubleColumnTest() {
        DataFrame dataFrame = new DataFrame("testFrame");
        dataFrame.addDoubleColumn("newColumn");
        assertEquals("newColumn", dataFrame.getColumnAt(0).getName());
    }

}