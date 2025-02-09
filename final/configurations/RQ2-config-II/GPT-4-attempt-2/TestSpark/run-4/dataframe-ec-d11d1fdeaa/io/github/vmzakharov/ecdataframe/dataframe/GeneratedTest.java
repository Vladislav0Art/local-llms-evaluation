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

public class GeneratedTest {

    @Test
    public void addStringColumnTest() {
        DataFrame df = new DataFrame("test");
        df.addStringColumn("newColumn");
        assertEquals(1, df.columnCount());
        assertEquals("newColumn", df.getColumnAt(0).getName());
    }

    @Test
    public void addLongColumnTest() {
        DataFrame df = new DataFrame("test");
        df.addLongColumn("newColumn");
        DfColumn column = df.getColumnAt(0);
        assertEquals("newColumn", column.getName());
        assertEquals(ValueType.LONG, column.getType());
    }

    @Test
    public void addDateTimeColumnTest() {
        DataFrame df = new DataFrame("test");
        df.addDateTimeColumn("newColumn", Lists.immutable.with(LocalDate.now(), LocalDate.now()));
        assertEquals(1, df.columnCount());
        assertEquals("newColumn", df.getColumnAt(0).getName());
    }

    @Test
    public void addColumnTest() {
        DataFrame df = new DataFrame("test");
        df.addColumn("newColumn", ValueType.BOOLEAN);
        assertEquals(1, df.columnCount());
        assertEquals("newColumn", df.getColumnAt(0).getName());
    }

    @Test
    public void getCountsTest() {
        DataFrame df = new DataFrame("test");
        df.addLongColumn("column");
        df.addRow();
        assertEquals(1, df.rowCount());
        assertEquals(1, df.columnCount());
    }

    @Test
    public void evaluateExpressionTest() {
        DataFrame df = new DataFrame("test");
        df.addLongColumn("column", Lists.mutable.with(1));
        Object result = df.evaluateExpression("column + 1", 0);
        assertNotNull(result);
        assertEquals(2, result);
    }

    @Test
    public void isNotEmptyTest() {
        DataFrame df = new DataFrame("test");
        df.addLongColumn("column", Lists.mutable.with(1));
        assertTrue(df.isNotEmpty());
    }

    @Test
    public void getNameTest() {
        DataFrame df = new DataFrame("test");
        String name = df.getName();
        assertEquals("test", name);
    }

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