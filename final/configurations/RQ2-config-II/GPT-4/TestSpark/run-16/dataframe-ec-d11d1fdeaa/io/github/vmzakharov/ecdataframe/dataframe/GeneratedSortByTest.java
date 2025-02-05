package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSortByTest {

    @Test
    public void sortByTest() {
        DataFrame df = new DataFrame("dataframe");
        df.addColumn("column1");
        DfColumn column = df.getColumnNamed("column1");
        MutableList<DfColumnSortOrder> orders = Lists.mutable.of(DfColumnSortOrder.ASC);
        df.sortBy(Lists.mutable.with(column.getColumnName()), orders);
        assertEquals(records, df.getData());
        df.sortBy(Lists.mutable.with(column.getColumnName()), orders.reverseThis());
        assertEquals(records.reverseThis(), df.getData());
    }

}