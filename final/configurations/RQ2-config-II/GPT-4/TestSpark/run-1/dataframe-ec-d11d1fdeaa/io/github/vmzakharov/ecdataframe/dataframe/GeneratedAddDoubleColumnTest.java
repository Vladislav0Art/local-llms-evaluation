package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GeneratedAddDoubleColumnTest {

    @Test
    public void addDoubleColumnTest() {
        DataFrame testDataFrame = new DataFrame("Test Frame");
        testDataFrame.addDoubleColumn("Test Column");
        assertNotNull("Test Column should exist", testDataFrame.getColumnNamed("Test Column"));
    }

}