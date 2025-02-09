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

public class GeneratedGetDateTimeTest {

    @Test
    public void getDateTimeTest() {
        DataFrame df = new DataFrame("testFrame");
        df.addDateTimeColumn("column1", Arrays.asList(
                LocalDateTime.of(2021, 8, 5, 13, 15),
                LocalDateTime.of(2021, 9, 3, 14, 15)));
        LocalDateTime dateTime = df.getDateTime("column1", 0);
        Assert.assertEquals(LocalDateTime.of(2021, 8, 5, 13, 15), dateTime);
    }

}