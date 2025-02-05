package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedAddRowWithValuesTest {

    @Test
    public void addRowWithValuesTest() {
        DataFrame df = new DataFrame("Test");
        df.addRow("Test", 1);
        assertEquals(1, df.rowCount());
    }

}