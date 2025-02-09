package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedAddRowTest {

    @Test
    public void addRowTest() {
        DataFrame dataFrame = new DataFrame("NewFrame");
        dataFrame.addRow();
        assertEquals(1, dataFrame.rowCount());
    }

}