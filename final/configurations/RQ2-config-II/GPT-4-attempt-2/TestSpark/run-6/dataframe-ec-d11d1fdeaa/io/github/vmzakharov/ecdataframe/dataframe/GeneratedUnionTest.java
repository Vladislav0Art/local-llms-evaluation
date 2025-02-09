package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedUnionTest {

    @Test
    public void unionTest() {
        DataFrame dataFrame1 = new DataFrame("DataFrame1");
        DataFrame dataFrame2 = new DataFrame("DataFrame2");
        assertNotNull(dataFrame1.union(dataFrame2));
    }

}