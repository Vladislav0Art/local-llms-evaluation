package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.list.mutable.IntInterval;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedAddStringColumnStringColumnNameExpressionAsStringTest {

    @Test
    public void addStringColumnStringColumnNameExpressionAsStringTest() {
        DataFrame pdf = new DataFrame("PDF");
        pdf.addStringColumn("newColumn", "abc");
        assertEquals("abc", pdf.getValueAt(0, 0).toString());
    }

}