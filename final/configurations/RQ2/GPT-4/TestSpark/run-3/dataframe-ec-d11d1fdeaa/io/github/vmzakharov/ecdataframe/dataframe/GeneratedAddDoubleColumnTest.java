package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddDoubleColumnTest {

    @Test
    public void addDoubleColumnTest() {
        DataFrame dataFrame = new DataFrame("testFrame");
        dataFrame.addDoubleColumn("newColumn");
        assertEquals("newColumn", dataFrame.getColumnAt(0).getName());
    }

}