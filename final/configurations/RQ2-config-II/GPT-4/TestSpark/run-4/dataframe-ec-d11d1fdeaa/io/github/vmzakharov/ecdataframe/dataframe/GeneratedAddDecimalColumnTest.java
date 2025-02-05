package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedAddDecimalColumnTest {

    @Test
    public void addDecimalColumnTest() {
        DataFrame dataFrame = new DataFrame("testDataFrame");
        dataFrame.addDecimalColumn("newColumn");
        assertTrue(dataFrame.hasColumn("newColumn"));
    }

}