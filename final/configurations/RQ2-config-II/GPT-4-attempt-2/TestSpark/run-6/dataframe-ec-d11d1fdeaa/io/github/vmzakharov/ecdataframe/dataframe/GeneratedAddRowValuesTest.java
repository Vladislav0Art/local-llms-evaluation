package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedAddRowValuesTest {

    @Test
    public void addRowValuesTest() {
        DataFrame dataFrame = new DataFrame("NewFrame");
        dataFrame.addRow("Value1", "Value2");
        assertEquals(1, dataFrame.rowCount());
    }

}