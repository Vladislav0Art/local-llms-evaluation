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
public class GeneratedAddRowTest {

    @Test
    public void addRowTest() {
        DataFrame dataFrame = new DataFrame("dataFrame1");
        dataFrame.addStringColumn("name");
        assertEquals(0, dataFrame.rowCount());
        dataFrame.addRow();
        assertEquals(1, dataFrame.rowCount());
    }

}