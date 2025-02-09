package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedAggregateByTest {

    @Test
    public void aggregateByTest() {
        DataFrame df = new DataFrame("test");
        df.addLongColumn("ID", Arrays.asList(1L, 2L, 3L));

        DataFrame aggregate = df.aggregateBy(
                Lists.immutable.with(AggregateFunctions.count("ID")),
                Lists.immutable.with("ID")
        );

        assertEquals(3, aggregate.rowCount());
        assertEquals("ID", aggregate.getColumnAt(0).getName());
    }

}