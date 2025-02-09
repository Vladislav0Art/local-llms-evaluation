package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedGetDecimalTest {

    @Test
    public void getDecimalTest() {
        DataFrame dataFrame = new DataFrame("NewFrame");
        dataFrame.addDecimalColumn("Column1", Arrays.asList(BigDecimal.ONE));
        assertEquals(BigDecimal.ONE, dataFrame.getDecimal("Column1", 0));
    }

}