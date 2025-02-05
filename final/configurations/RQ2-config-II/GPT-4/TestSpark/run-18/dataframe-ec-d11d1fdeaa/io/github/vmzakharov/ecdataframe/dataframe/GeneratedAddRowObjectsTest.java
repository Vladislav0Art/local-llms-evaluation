package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.list.mutable.IntInterval;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedAddRowObjectsTest {

    @Test
    public void addRowObjectsTest() {
        DataFrame pdf = new DataFrame("PDF");
        pdf.addStringColumn("StringColumn")
                .addLongColumn("LongColumn")
                .addRow("TestValue", 123);

        assertEquals("TestValue", pdf.getString("StringColumn", 0));
        assertEquals(123, pdf.getLong("LongColumn", 0));
    }

}