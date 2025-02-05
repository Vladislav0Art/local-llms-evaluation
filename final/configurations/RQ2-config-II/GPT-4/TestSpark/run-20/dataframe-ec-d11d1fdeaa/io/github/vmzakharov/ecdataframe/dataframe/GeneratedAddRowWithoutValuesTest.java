package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedAddRowWithoutValuesTest {

    @Test
    public void addRowWithoutValuesTest() {
        DataFrame df = new DataFrame("Test");
        df.addRow();
        assertEquals(1, df.rowCount());
    }

}