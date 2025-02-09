package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedGetDateTest {

    @Test
    public void getDateTest() {
        DataFrame dataFrame = new DataFrame("NewFrame");
        dataFrame.addDateColumn("Column1", Arrays.asList(LocalDate.now()));
        assertEquals(LocalDate.now(), dataFrame.getDate("Column1", 0));
    }

}