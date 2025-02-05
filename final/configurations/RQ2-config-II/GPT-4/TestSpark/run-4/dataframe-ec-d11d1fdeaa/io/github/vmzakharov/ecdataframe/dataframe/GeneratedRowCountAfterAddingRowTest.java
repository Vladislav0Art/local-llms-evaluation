package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedRowCountAfterAddingRowTest {

    @Test
    public void rowCountAfterAddingRowTest() {
        DataFrame dataFrame = new DataFrame("testDataFrame");
        dataFrame.addRow(Arrays.asList(Value.of("test")));
        assertEquals(1, dataFrame.rowCount());
    }

}