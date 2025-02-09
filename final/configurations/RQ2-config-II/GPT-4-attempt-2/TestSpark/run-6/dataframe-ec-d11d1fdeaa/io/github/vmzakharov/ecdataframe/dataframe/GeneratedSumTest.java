package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedSumTest {

    @Test
    public void sumTest() {
        DataFrame dataFrame = new DataFrame("NewFrame");
        assertNotNull(dataFrame.sum(Arrays.asList("Column1", "Column2")));
    }

}