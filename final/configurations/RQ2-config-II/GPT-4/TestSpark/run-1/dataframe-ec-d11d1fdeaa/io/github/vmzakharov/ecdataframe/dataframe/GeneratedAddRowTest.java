package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GeneratedAddRowTest {

    @Test
    public void addRowTest() {
        DataFrame testDataFrame = new DataFrame("Test Frame");
        testDataFrame.addStringColumn("String Column");
        testDataFrame.addLongColumn("Long Column");
        testDataFrame.addRow(Collections.emptyList());
        assertEquals("Row count should be 1", 1, testDataFrame.rowCount());
    }

}