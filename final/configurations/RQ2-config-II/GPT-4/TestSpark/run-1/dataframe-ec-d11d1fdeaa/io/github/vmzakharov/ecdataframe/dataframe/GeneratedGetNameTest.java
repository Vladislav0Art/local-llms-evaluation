package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        DataFrame testDataFrame = new DataFrame("Test Frame");
        assertEquals("Name should be Test Frame", "Test Frame", testDataFrame.getName());
    }

}