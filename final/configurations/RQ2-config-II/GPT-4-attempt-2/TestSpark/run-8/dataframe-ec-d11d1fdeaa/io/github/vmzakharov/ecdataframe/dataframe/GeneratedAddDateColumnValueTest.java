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

public class GeneratedAddDateColumnValueTest {

    @Test
    public void addDateColumnValueTest() {
        DataFrame df = new DataFrame("testFrame");
        df.addDateColumn("column1", Arrays.asList(LocalDate.of(2020, 5, 20),
                LocalDate.of(2021, 6, 5)));
        Assert.assertEquals(LocalDate.of(2020, 5, 20), df.getDate("column1", 0));
    }

}