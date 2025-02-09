package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfDoubleColumn;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class GeneratedDropColumnsTest {

    @Test
    public void dropColumnsTest() {
        DataFrame df = new DataFrame("testFrame");
        df.addStringColumn("column1");
        df.addStringColumn("column2");
        df.dropColumns(Lists.mutable.of("column1"));
        Assert.assertFalse(df.hasColumn("column1"));
        Assert.assertTrue(df.hasColumn("column2"));
    }

}