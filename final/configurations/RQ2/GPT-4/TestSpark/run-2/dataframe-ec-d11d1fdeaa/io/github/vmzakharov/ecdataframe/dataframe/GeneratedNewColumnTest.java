package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNewColumnTest {

    @Test
    public void newColumnTest() {
        DataFrame df = new DataFrame("testFrame");
        DfColumn column = df.newColumn("age", ValueType.LONG);
        Assert.assertEquals("age", column.getName());
        Assert.assertEquals(ValueType.LONG, column.getType());
    }

}