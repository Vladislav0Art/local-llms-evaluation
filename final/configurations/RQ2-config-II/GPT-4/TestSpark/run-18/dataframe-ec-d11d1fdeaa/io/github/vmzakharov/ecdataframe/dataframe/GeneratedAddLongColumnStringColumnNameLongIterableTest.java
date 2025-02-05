package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.list.mutable.IntInterval;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedAddLongColumnStringColumnNameLongIterableTest {

    @Test
    public void addLongColumnStringColumnNameLongIterableTest() {
        DataFrame pdf = new DataFrame("PDF");
        pdf.addLongColumn("newColumn", IntInterval.fromTo(3, 6));
        assertEquals(3, pdf.getLong("newColumn", 0));
    }

}