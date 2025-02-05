package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GeneratedIsPoolingEnabledTest {

    @Test
    public void isPoolingEnabledTest() {
        DataFrame testDataFrame = new DataFrame("Test Frame");
        assertFalse("Pooling should be disabled", testDataFrame.isPoolingEnabled());
    }

}