package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddDoubleColumnTest {

    @Test
    public void addDoubleColumnTest() {
        DataFrame df = new DataFrame("test");
        df.addDoubleColumn("doubleCol");
        assertTrue(df.hasColumn("doubleCol"));
    }

}