package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedGetLongTest {

    @Test
    public void getLongTest() {
        DataFrame dataFrame = new DataFrame("NewFrame");
        dataFrame.addLongColumn("Column1", Arrays.asList(1L, 2L));
        assertEquals(BigInteger.valueOf(1L), dataFrame.getLong("Column1", 0));
    }

}