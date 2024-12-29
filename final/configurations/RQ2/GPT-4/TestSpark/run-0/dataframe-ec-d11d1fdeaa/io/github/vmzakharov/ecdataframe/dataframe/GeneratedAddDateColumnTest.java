package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddDateColumnTest {

    @Test
    public void addDateColumnTest() {
        DataFrame df = new DataFrame("test");
        df.addDateColumn("dateCol");
        assertTrue(df.hasColumn("dateCol"));
    }

}