package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedGetDoubleTest {

    @Test
    public void getDoubleTest() {
        DataFrame dataFrame = new DataFrame("NewFrame");
        dataFrame.addDoubleColumn("Column1", Arrays.asList(1.1, 2.2));
        assertEquals(1.1, dataFrame.getDouble("Column1", 0), 0.1);
    }

}