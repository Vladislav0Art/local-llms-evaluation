package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedUnsortTest {

    @Test
    public void unsortTest() {
        DataFrame dataFrame = new DataFrame("NewFrame");
        assertFalse(dataFrame.unsort());
    }

}