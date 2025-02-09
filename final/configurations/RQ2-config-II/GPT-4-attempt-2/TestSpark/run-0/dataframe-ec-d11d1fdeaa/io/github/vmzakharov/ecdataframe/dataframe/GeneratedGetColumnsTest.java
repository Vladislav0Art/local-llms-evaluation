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

public class GeneratedGetColumnsTest {

    @Test
    public void getColumnsTest() {
        DataFrame dataFrame = new DataFrame("testData");
        dataFrame.addStringColumn("strColumn");
        dataFrame.addLongColumn("longColumn");
        DataFrame spyDataFrame = spy(dataFrame);
        spyDataFrame.getColumns();
        verify(spyDataFrame).getColumns();
    }

}