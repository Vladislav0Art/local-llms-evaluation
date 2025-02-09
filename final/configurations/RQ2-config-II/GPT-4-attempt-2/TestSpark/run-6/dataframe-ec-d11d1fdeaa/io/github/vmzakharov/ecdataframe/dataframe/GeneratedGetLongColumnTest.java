package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedGetLongColumnTest {

    @Test
    public void getLongColumnTest() {
        DataFrame dataFrame = new DataFrame("NewFrame");
        dataFrame.addLongColumn("Column1", Arrays.asList(1L, 2L));
        assertNotNull(dataFrame.getLongColumn("Column1"));
    }

}