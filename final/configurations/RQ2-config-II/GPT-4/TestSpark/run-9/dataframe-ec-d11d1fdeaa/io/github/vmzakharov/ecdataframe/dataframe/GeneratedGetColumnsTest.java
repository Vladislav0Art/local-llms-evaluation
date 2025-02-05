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

public class GeneratedGetColumnsTest {

    @Test
    public void getColumnsTest() {
        DataFrame df = new DataFrame("testDataFrame");
        df.addStringColumn("stringColumn");
        df.addLongColumn("longColumn");
        assertEquals(2, df.getColumns().size());
        assertEquals("stringColumn", df.getColumns().get(0).getName());
        assertEquals("longColumn", df.getColumns().get(1).getName());
    }

}