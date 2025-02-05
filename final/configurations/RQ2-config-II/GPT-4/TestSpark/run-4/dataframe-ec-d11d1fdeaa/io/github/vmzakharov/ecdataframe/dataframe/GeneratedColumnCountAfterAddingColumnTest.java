package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedColumnCountAfterAddingColumnTest {

    @Test
    public void columnCountAfterAddingColumnTest() {
        DataFrame dataFrame = new DataFrame("testDataFrame");
        dataFrame.addColumn("newColumn", ValueType.STRING);
        assertEquals(1, dataFrame.columnCount());
    }

}