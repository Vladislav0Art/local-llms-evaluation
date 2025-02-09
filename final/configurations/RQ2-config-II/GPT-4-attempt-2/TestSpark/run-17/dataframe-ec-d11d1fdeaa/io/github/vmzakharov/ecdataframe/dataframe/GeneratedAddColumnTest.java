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

public class GeneratedAddColumnTest {

    @Test
    public void addColumnTest() {
        DataFrame df = new DataFrame("TestFrame");
        df.addColumn("TestColumn", ValueType.STRING);
        DfColumn column = df.getColumnNamed("TestColumn");
        assertEquals(column.getValueType(), ValueType.STRING);
    }

}