package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import io.github.vmzakharov.ecdataframe.dataframe.DfDoubleColumn;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.impl.factory.Sets;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSortByTest {

    @Test
    public void sortByTest() {
        DataFrame df = new DataFrame("Test");
        df.addDoubleColumn("Score").addDateColumn("Date");
        df.addRow(1.0, LocalDate.now()).addRow(2.0, LocalDate.now());
        df.sortBy(FastList.newListWith("Score"), FastList.newListWith(DfColumnSortOrder.DESC));
        assertEquals(2.0, df.getDouble("Score", 0), 0.001);
    }

}