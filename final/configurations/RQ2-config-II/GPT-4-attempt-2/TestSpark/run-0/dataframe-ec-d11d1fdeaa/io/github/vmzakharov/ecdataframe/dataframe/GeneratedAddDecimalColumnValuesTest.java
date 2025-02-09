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

public class GeneratedAddDecimalColumnValuesTest {

    @Test
    public void addDecimalColumnValuesTest() {
        DataFrame dataFrame = new DataFrame("test");
        ListIterable<BigDecimal> values = Lists.immutable.of(BigDecimal.valueOf(5.67), BigDecimal.valueOf(3.21));
        dataFrame.addDecimalColumn("newColumn", values);
        Assert.assertEquals(BigDecimal.valueOf(5.67), dataFrame.getDecimal("newColumn", 0));
        Assert.assertEquals(BigDecimal.valueOf(3.21), dataFrame.getDecimal("newColumn", 1));
    }

}