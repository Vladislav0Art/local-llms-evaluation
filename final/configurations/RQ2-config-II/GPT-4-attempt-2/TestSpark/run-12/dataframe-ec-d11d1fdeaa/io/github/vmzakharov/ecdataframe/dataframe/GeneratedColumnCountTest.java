package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedColumnCountTest {

    @Test
    public void columnCountTest() {
        DataFrame df = new DataFrame("test");
        df.addStringColumn("column1");
        df.addStringColumn("column2");
        assertEquals(2, df.columnCount());
    }

}