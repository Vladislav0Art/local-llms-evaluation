package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedCopyTest {

    @Test
    public void copyTest() {
        DataFrame dataFrame1 = new DataFrame("Frame1");
        DataFrame dataFrame2 = dataFrame1.copy("Frame2");
        assertEquals("Frame2", dataFrame2.getName());
    }

}