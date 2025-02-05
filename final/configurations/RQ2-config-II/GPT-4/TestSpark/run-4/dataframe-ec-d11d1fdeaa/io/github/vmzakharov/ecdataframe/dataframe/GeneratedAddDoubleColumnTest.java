package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedAddDoubleColumnTest {

    @Test
    public void addDoubleColumnTest() {
        DataFrame dataFrame = new DataFrame("testDataFrame");
        dataFrame.addDoubleColumn("newColumn");
        assertTrue(dataFrame.hasColumn("newColumn"));
    }

}