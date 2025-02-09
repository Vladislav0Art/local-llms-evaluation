package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedForEachTest {

    @Test
    public void forEachTest() {
        DataFrame dataFrame = Mockito.mock(DataFrame.class);
        dataFrame.forEach(System.out::println);
        Mockito.verify(dataFrame, Mockito.times(1)).forEach(System.out::println);
    }

}