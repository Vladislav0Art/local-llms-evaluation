package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddColumnTest {

    @Test
    public void addColumnTest() {
        DataFrame df = new DataFrame("test");
        df.addColumn("column1", "1");
        assertEquals(1, df.rowCount());
        assertEquals("column1", df.getColumnAt(0).getName());
    }

}