package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedJoinWithComplementsTest {

    @Test
    public void joinWithComplementsTest() {
        DataFrame df1 = new DataFrame("df1");
        DataFrame df2 = new DataFrame("df2");
        df1.addStringColumn("name");
        df1.addStringColumn("age");
        df2.addStringColumn("name");
        df2.addStringColumn("age");
        df1.addRow(new ArrayList<>(Arrays.asList("Tom", "25")));
        df2.addRow(new ArrayList<>(Arrays.asList("Dick", "30")));
        Triplet<DataFrame> dfTriplet = df1.joinWithComplements(df2, Lists.mutable.of("name"), Lists.mutable.of("name"));
        assertEquals(3, dfTriplet.getOne().columnCount());
        assertEquals(3, dfTriplet.getTwo().columnCount());
    }

}