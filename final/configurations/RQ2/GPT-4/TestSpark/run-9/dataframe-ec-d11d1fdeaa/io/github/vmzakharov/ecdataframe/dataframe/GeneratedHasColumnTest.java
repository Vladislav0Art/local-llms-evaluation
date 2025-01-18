package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHasColumnTest {

    @Test
    public void hasColumnTest() {
        DataFrame df = new DataFrame("Test");
        df.addStringColumn("Column1");
        assertTrue(df.hasColumn("Column1"));
    }

}