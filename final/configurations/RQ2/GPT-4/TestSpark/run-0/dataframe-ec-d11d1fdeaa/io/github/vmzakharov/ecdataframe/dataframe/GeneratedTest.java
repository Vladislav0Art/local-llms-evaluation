package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import io.github.vmzakharov.ecdataframe.dataframe.AggregateFunction;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void DataFrameConstructorTest() {
        DataFrame df = new DataFrame("test");
        assertNotNull(df);
        assertEquals("test", df.getName());
    }

    @Test
    public void addStringColumnTest() {
        DataFrame df = new DataFrame("test");
        df.addStringColumn("stringCol");
        assertTrue(df.hasColumn("stringCol"));
    }

    @Test
    public void addLongColumnTest() {
        DataFrame df = new DataFrame("test");
        df.addLongColumn("longCol");
        assertTrue(df.hasColumn("longCol"));
    }

    @Test
    public void getColumnNamedTest() {
        DataFrame df = new DataFrame("test");
        df.addLongColumn("longCol");
        assertNotNull(df.getColumnNamed("longCol"));
    }

    @Test
    public void getColumnAtTest() {
        DataFrame df = new DataFrame("test");
        df.addLongColumn("longCol");
        assertNotNull(df.getColumnAt(0));
    }

    @Test
    public void asCsvStringTest() {
        DataFrame df = new DataFrame("test");
        df.addLongColumn("longCol");
        df.addRow(10L);
        assertNotNull(df.asCsvString());
    }

    @Test
    public void addColumnTest() {
        DataFrame df = new DataFrame("test");
        df.addColumn("longCol", ValueType.LONG);
        assertTrue(df.hasColumn("longCol"));
    }

    @Test
    public void aggregateTest() {
        DataFrame df = new DataFrame("test");
        df.addLongColumn("longCol");
        df.addRow(10L);
        ListIterable<AggregateFunction> functions = FastList.newList();
        // TODO: add aggregate function instances to the 'functions' list based your requirements.
        DataFrame aggregateDf = df.aggregate(functions);
        assertNotNull(aggregateDf);
    }

}