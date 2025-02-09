package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.primitive.IntLists;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class GeneratedDropColumnsTest {

    // Sample test cases to get coverage for multiple methods. Not exhaustive.

    @Test
    public void dropColumnsTest() {
        DataFrame df = new DataFrame("TestDF");
        df.addStringColumn("TestColumn");
        df.dropColumns(Arrays.asList("TestColumn"));

        Assert.assertEquals(0, df.columnCount());
    }

}