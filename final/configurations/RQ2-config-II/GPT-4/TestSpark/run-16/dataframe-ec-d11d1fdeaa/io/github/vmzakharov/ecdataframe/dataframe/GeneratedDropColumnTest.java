package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDropColumnTest {

    @Test
    public void dropColumnTest() {
        DataFrame df = new DataFrame("testDropColumn");
        df.enablePooling();
        df.addStringColumn("col1");
        df.dropColumn("col1");
        assertFalse(df.hasColumn("col1"));
    }

}