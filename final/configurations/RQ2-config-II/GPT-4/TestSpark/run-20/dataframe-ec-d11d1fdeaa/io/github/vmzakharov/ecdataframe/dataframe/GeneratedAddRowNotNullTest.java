package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedAddRowNotNullTest {

    @Test
    public void addRowNotNullTest() {
        DataFrame df = new DataFrame("Test");
        ArrayList<Value> rowValues = new ArrayList<>();
        rowValues.add(Mockito.mock(Value.class));
        df.addRow(rowValues);
        assertEquals(1, df.rowCount());
    }

}