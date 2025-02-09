package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.math.BigDecimal;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEnablePoolingTest {

    @Test
    public void enablePoolingTest() {
        DataFrame dataFrame = new DataFrame("dataFrame1");
        assertFalse(dataFrame.isPoolingEnabled());
        dataFrame.enablePooling();
        assertTrue(dataFrame.isPoolingEnabled());
    }

}