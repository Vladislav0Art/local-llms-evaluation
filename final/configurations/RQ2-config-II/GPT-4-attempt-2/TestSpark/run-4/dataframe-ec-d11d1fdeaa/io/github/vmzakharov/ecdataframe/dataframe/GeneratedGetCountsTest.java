package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedGetCountsTest {

    @Test
    public void getCountsTest() {
        DataFrame df = new DataFrame("test");
        df.addLongColumn("column");
        df.addRow();
        assertEquals(1, df.rowCount());
        assertEquals(1, df.columnCount());
    }

}