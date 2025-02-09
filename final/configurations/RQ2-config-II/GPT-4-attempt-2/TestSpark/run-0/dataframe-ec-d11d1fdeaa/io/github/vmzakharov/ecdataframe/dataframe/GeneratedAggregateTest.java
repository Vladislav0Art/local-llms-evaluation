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

public class GeneratedAggregateTest {

    @Test
    public void aggregateTest() {
        DataFrame data = new DataFrame("test");
        data.addLongColumn("values", Lists.immutable.of(10L, 20L, 30L, 40L));
        ListIterable<AggregateFunction> aggFuncs = Lists.immutable.of(AggregateFunction.sum("values", "Sum"));
        DataFrame resultDf = data.aggregate(aggFuncs);
        Assert.assertEquals(Long.valueOf(100L), resultDf.getLong("Sum", 0));
    }

}