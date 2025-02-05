package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.list.mutable.IntInterval;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedAddStringColumnStringColumnNameTest {

    @Test
    public void addStringColumnStringColumnNameTest() {
        DataFrame pdf = new DataFrame("PDF");
        pdf.addStringColumn("newColumn");
        assertEquals("newColumn", pdf.getColumnAt(0).getName());
    }

}