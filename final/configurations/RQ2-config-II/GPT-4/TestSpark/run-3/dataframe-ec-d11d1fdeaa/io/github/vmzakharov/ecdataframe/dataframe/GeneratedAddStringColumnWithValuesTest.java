package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumns;
import io.github.vmzakharov.ecdataframe.dataframe.DfDecimalColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfDoubleColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfLongColumn;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedAddStringColumnWithValuesTest {

    @Test
    public void addStringColumnWithValuesTest() {
        DataFrame dataFrame = new DataFrame("Test Dataframe");
        dataFrame.addStringColumn("String Column", new ArrayList<String>(Arrays.asList("value1", "value2")));
        Assert.assertEquals(2, dataFrame.rowCount());
    }

}