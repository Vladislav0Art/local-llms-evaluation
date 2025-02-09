package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedCreateIndexTest {

    @Test
    public void createIndexTest() {
        DataFrame dataFrame = new DataFrame("NewFrame");
        dataFrame.createIndex("Index1", Arrays.asList("Column1", "Column2"));
        assertNotNull(dataFrame.index("Index1"));
    }

}