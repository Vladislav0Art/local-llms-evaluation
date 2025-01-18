package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        DataFrame dataFrame = new DataFrame("testFrame");
        assertEquals("testFrame", dataFrame.getName());
    }

}