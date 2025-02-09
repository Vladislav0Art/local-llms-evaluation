package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddRowTest {

    @Test
    public void addRowTest() {
        DataFrame df = new DataFrame("test");
        df.addStringColumn("column1");
        df.addRow(Lists.fixedSize.of("value1"));
        assertEquals(1, df.rowCount());
    }

}