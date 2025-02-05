package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.list.mutable.IntInterval;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSortByTest {

    @Test
    public void sortByTest() {
        DataFrame pdf = new DataFrame("PDF");
        pdf.addStringColumn("StringColumn")
                .addRow("c")
                .addRow("a")
                .addRow("b");
        pdf.sortBy(Lists.immutable.of("StringColumn"));

        assertEquals("a", pdf.getString("StringColumn", 0));
    }

}