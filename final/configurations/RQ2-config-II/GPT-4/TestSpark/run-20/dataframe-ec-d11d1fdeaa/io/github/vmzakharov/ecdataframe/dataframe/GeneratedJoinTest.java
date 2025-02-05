package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedJoinTest {

    @Test
    public void joinTest() {
        DataFrame df1 = new DataFrame("df1");
        DataFrame df2 = new DataFrame("df2");
        df1.addStringColumn("name");
        df1.addStringColumn("age");
        df2.addStringColumn("name");
        df2.addStringColumn("age");
        df1.addRow(new ArrayList<>(Arrays.asList("Tom", "25")));
        df2.addRow(new ArrayList<>(Arrays.asList("Tom", "30")));
        DataFrame joinedDf = df1.join(df2, "name", "name");
        assertEquals(3, joinedDf.columnCount());
        assertEquals(1, joinedDf.rowCount());
    }

}