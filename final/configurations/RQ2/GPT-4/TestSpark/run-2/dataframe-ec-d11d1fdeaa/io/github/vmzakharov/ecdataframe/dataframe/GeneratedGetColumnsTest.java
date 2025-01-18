package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetColumnsTest {

    @Test
    public void getColumnsTest() {
        DataFrame df = new DataFrame("testFrame");
        df.addStringColumn("name");
        df.addStringColumn("address");
        Assert.assertEquals(2, df.getColumns().size());
    }

}