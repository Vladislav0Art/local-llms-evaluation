package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedIsNullTest {

    @Test
    public void isNullTest() {
        DataFrame dataFrame = new DataFrame("NewFrame");
        dataFrame.addStringColumn("Column1", "Value1");
        assertFalse(dataFrame.isNull("Column1", 0));
    }

}