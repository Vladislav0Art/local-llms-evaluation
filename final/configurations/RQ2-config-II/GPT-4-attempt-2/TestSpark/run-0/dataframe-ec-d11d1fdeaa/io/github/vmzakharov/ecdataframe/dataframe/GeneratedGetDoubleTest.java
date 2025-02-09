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

public class GeneratedGetDoubleTest {

    @Test
    public void getDoubleTest() {
        DataFrame dataFrame = new DataFrame("testData");
        ListIterable<Double> values = Lists.mutable.of(324.5, 5432.3);
        dataFrame.addDoubleColumn("dobColumn", values);
        Assert.assertEquals(Double.valueOf(5432.3), dataFrame.getDouble("dobColumn", 1), 0.001);
    }

}