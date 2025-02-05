package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedAddRowObjectTest {

    @Test
    public void addRowObjectTest() {
        DataFrame df = new DataFrame("Test");
        Object[] values = new Object[]{"Test", 1, 2.5, LocalDate.now(), LocalDateTime.now()};
        df.addRow(values);
        assertEquals(1, df.rowCount());
    }

}