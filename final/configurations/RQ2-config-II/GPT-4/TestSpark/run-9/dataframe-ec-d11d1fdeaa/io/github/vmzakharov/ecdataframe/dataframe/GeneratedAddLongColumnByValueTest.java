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

public class GeneratedAddLongColumnByValueTest {

    @Test
    public void addLongColumnByValueTest() {
        DataFrame df = new DataFrame("testDataFrame");
        df.addLongColumn("longColumn", new LongArrayList(new long[]{1, 2, 3}));
        assertEquals(1, df.columnCount());
        assertEquals("longColumn", df.getColumnAt(0).getName());
        assertEquals(3, ((DfLongColumn) df.getColumnAt(0)).getSize());
    }

    public void addDateColumnByExpressionStringTest() {
        DataFrame df = new DataFrame("testDataFrame");
        df.addDateColumn("dateColumn", "2022-01-01");
        assertEquals(1, df.columnCount());
        assertEquals("dateColumn", df.getColumnAt(0).getName());
        assertTrue(df.getColumnAt(0) instanceof DfDateColumn);
    }

    public void addDecimalColumnTest() {
        DataFrame df = new DataFrame("testDataFrame");
        df.addDecimalColumn("decimalColumn", Lists.immutable.of(new BigDecimal("100"), new BigDecimal("200")));
        assertEquals(1, df.columnCount());
        assertEquals("decimalColumn", df.getColumnAt(0).getName());
        assertTrue(df.getColumnAt(0) instanceof DfDecimalColumn);
    }

}