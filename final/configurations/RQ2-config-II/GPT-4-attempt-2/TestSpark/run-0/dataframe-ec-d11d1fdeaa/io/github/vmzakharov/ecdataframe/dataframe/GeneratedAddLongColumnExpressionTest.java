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

public class GeneratedAddLongColumnExpressionTest {

    @Test
    public void addLongColumnExpressionTest() {
        DataFrame dataFrame = new DataFrame("test");
        dataFrame.addLongColumn("newColumn", "3+2");
        Assert.assertTrue(dataFrame.hasColumn("newColumn"));
    }

}