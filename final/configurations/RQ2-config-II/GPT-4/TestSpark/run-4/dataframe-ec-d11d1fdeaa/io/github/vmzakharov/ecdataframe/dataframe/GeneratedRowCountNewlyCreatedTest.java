package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedRowCountNewlyCreatedTest {

    @Test
    public void rowCountNewlyCreatedTest() {
        DataFrame dataFrame = new DataFrame("testDataFrame");
        assertEquals(0, dataFrame.rowCount());
    }

}