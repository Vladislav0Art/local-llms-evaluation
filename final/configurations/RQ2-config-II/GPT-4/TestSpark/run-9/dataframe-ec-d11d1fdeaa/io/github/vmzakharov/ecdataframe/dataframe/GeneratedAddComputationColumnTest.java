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

public class GeneratedAddComputationColumnTest {

    @Test
    public void addComputationColumnTest() {
        DataFrame df = new DataFrame("testActivityIndicator");
        df.addStringColumn("name", Lists.immutable.of("item1", "item2", "item3"));
        df.addLongColumn("quantity", Lists.immutable.of(10L, 20L, 30L));
        df.addColumn("quantityDouble", ValueType.DOUBLE, "quantity * 2");
        assertEquals(3, df.getColumns().size());
        assertEquals("quantityDouble", df.getColumnAt(2).getName());
        assertEquals(20.0, df.getDouble("quantityDouble", 0), 1E-5);
        assertEquals(40.0, df.getDouble("quantityDouble", 1), 1E-5);
        assertEquals(60.0, df.getDouble("quantityDouble", 2), 1E-5);
    }

}