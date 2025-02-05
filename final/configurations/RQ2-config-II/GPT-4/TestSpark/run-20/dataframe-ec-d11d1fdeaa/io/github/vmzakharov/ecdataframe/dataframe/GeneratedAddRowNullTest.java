package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedAddRowNullTest {

    @Test
    public void addRowNullTest() {
        DataFrame df = new DataFrame("Test");
        ArrayList<Value> rowValues = new ArrayList<>();
        rowValues.add(null);
        df.addRow(rowValues);
        assertEquals(0, df.rowCount());
    }

}