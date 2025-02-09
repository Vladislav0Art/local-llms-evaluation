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
public class GeneratedGetColumnAtTest {

    @Test
    public void getColumnAtTest() {
        DataFrame dataFrame = new DataFrame("dataFrame1");
        dataFrame.addStringColumn("name");
        assertNotNull(dataFrame.getColumnAt(0));
    }

}