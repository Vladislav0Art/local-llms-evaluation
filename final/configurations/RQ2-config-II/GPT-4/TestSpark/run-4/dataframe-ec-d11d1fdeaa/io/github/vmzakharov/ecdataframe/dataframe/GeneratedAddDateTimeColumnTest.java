package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedAddDateTimeColumnTest {

    @Test
    public void addDateTimeColumnTest() {
        DataFrame dataFrame = new DataFrame("testDataFrame");
        dataFrame.addDateTimeColumn("newColumn");
        assertTrue(dataFrame.hasColumn("newColumn"));
    }

}