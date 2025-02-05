package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GeneratedEnablePoolingTest {

    @Test
    public void enablePoolingTest() {
        DataFrame testDataFrame = new DataFrame("Test Frame");
        testDataFrame.enablePooling();
        assertTrue("Pooling should be enabled", testDataFrame.isPoolingEnabled());
    }

}