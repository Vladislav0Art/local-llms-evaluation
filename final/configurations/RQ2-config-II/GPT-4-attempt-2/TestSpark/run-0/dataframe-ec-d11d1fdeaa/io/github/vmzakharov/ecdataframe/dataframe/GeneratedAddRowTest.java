package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.mockito.Mockito.*;

public class GeneratedAddRowTest {

    @Test
    public void addRowTest() {
        DataFrame dataFrame = new DataFrame("testData");
        dataFrame.addStringColumn("strColumn");
        dataFrame.addLongColumn("longColumn");
        int rowNumber = dataFrame.addRow("firstRow", 2345);
        Assert.assertEquals(rowNumber, dataFrame.rowCount() - 1);
    }

}