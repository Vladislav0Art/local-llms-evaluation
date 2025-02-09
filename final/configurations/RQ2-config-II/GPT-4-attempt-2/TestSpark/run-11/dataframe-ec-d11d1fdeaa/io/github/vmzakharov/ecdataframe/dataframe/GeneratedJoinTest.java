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
public class GeneratedJoinTest {

    @Test
    public void joinTest() {
        DataFrame dataFrame1 = new DataFrame("dataFrame1");
        dataFrame1.addStringColumn("name");
        DataFrame dataFrame2 = new DataFrame("dataFrame2");
        dataFrame2.addStringColumn("name");
        assertNotNull(dataFrame1.join(dataFrame2, "name", "name"));
    }

}