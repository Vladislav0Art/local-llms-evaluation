package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedGetDateTimeTest {

    @Test
    public void getDateTimeTest() {
        DataFrame dataFrame = new DataFrame("NewFrame");
        dataFrame.addDateTimeColumn("Column1", Arrays.asList(LocalDateTime.now()));
        assertEquals(LocalDateTime.now(), dataFrame.getDateTime("Column1", 0));
    }

}