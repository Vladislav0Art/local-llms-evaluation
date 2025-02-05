package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.list.mutable.IntInterval;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedAddLongColumnStringColumnNameExpressionAsStringTest {

    @Test
    public void addLongColumnStringColumnNameExpressionAsStringTest() {
        DataFrame pdf = new DataFrame("PDF");
        pdf.addLongColumn("newColumn", "2");
        assertEquals(2, pdf.getLong("newColumn", 0));
    }

}