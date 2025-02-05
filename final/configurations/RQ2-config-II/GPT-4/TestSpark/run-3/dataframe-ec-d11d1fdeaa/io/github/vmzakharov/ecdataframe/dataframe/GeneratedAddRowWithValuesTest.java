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

public class GeneratedAddRowWithValuesTest {

    @Test
    public void addRowWithValuesTest() {
        DataFrame dataFrame = new DataFrame("Test Dataframe");
        dataFrame.addStringColumn("Column1");
        dataFrame.addStringColumn("Column2");
        Assert.assertEquals(0, dataFrame.rowCount());
        dataFrame.addRow("Test Cell 1", "Test Cell 2");
        Assert.assertEquals("Test Cell 1", dataFrame.getValueAsString(0, 0));
        Assert.assertEquals("Test Cell 2", dataFrame.getValueAsString(0, 1));
    }

}