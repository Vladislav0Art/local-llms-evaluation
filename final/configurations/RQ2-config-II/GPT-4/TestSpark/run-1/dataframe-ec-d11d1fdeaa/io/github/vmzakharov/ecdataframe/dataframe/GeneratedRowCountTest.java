package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GeneratedRowCountTest {

    @Test
    public void rowCountTest() {
        DataFrame testDataFrame = new DataFrame("Test Frame");
        assertEquals("Row count should be 0", 0, testDataFrame.rowCount());
    }

}