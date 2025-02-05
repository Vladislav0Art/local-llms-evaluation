package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedEnablePoolingTest {

    @Test
    public void enablePoolingTest() {
        DataFrame df = new DataFrame("Test");
        df.enablePooling();
        assertTrue(df.isPoolingEnabled());
    }

}