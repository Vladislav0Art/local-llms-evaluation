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

public class GeneratedAddRowTest {

    @Test
    public void addRowTest() {
        DataFrame df = new DataFrame("testFrame");
        df.addDoubleColumn("column1");
        df.addRow(Lists.mutable.of(ValueType.DOUBLE.newValue(4.3)));
        Assert.assertEquals(4.3, df.getDouble("column1", 0), 0.01);
    }

}