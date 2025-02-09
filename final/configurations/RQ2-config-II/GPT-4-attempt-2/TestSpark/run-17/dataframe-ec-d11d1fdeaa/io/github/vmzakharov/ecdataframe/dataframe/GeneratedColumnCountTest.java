package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import io.github.vmzakharov.ecdataframe.dataframe.DfStringColumn;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.primitive.LongLists;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedColumnCountTest {

    @Test
    public void columnCountTest() {
        DataFrame df = new DataFrame("TestFrame");
        df.addLongColumn("TestColumn", LongLists.mutable.of(1L, 2L, 3L));
        df.addStringColumn("TestColumn2");
        assertEquals(df.columnCount(), 2);
    }

}