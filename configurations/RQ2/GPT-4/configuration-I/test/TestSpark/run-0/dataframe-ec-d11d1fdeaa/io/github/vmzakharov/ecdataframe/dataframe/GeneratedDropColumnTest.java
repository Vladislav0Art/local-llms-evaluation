package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDropColumnTest {

    @Test
    public void dropColumnTest() {
        DataFrame df = new DataFrame("testing");
        df.addStringColumn("column1");
        df.dropColumn("column1");
        assertFalse(df.hasColumn("column1"));
    }

}