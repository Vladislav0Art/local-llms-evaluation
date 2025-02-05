package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetColumnsTest {

    @Test
    public void getColumnsTest() {
        DataFrame df = new DataFrame("Test");
        df.addLongColumn("newCol");
        assertEquals(1, df.getColumns().size());
    }

}