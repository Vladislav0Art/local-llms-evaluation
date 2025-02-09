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

public class GeneratedGetColumnsTest {

    @Test
    public void getColumnsTest() {
        DataFrame df = new DataFrame("Test");
        df.addLongColumn("Col1").addStringColumn("Col2").addDateColumn("Col3");
        ImmutableList<DfColumn> columns = df.getColumns();
        assertEquals(Sets.immutable.of("Col1", "Col2", "Col3").castToSet(), columns.collect(DfColumn::getName).toSet());
    }

}