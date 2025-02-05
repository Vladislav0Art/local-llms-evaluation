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

public class GeneratedIsEnabledPoolingTest {

    @Test
    public void isEnabledPoolingTest() {
        DataFrame df = new DataFrame("testDataFrame");
        df.enablePooling();
        assertTrue(df.isPoolingEnabled());
    }

}