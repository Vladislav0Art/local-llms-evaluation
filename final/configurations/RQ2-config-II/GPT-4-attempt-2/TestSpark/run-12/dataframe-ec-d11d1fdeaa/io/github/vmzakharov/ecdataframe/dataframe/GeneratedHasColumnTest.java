package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHasColumnTest {

    @Test
    public void hasColumnTest() {
        DataFrame df = new DataFrame("test");
        assertFalse(df.hasColumn("Column1"));

        df.addStringColumn("Column1");
        assertTrue(df.hasColumn("Column1"));
    }

}