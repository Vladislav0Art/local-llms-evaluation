package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.when;

public class GeneratedAddRowTestWithDecimalValues {

    @Test
    public void addRowTestWithDecimalValues() {
        DataFrame df = new DataFrame("Test");
        df.addDecimalColumn("Column1");
        df.addRow(BigDecimal.ONE);
        assertEquals(1, df.rowCount());
    }

}