package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedSumTest {

    @Test
    public void sumTest() {
        DataFrame df = new DataFrame("Test");
        df.addLongColumn("new_column_1");
        df.addLongColumn("new_column_2");
        df.addRow(new ArrayList<>(Arrays.asList("1", "2")));
        df.addRow(new ArrayList<>(Arrays.asList("3", "4")));
        DataFrame sumDf = df.sum(Lists.mutable.of("new_column_1", "new_column_2"));
        assertEquals(1, sumDf.columnCount());
        assertEquals(1, sumDf.rowCount());
    }

}