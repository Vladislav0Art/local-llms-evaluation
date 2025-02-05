package io.github.vmzakharov.ecdataframe.dataframe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.eclipse.collections.impl.list.mutable.primitive.LongArrayList;
import org.junit.Test;

public class GeneratedGetAggregateIndexTest {

    @Test
    public void getAggregateIndexTest() {
        DataFrame df = new DataFrame("testData");
        df.addLongColumn("longColumn", new LongArrayList(new long[]{1, 2, 3}));
        IntList aggregateIndex = df.getAggregateIndex(2);
        assertEquals(1, aggregateIndex.size());
        assertEquals(2, aggregateIndex.get(0));
    }

}