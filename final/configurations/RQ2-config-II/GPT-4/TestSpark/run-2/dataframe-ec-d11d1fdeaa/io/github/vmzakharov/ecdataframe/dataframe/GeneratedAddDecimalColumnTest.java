package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.utility.Iterate;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.math.BigDecimal;

import static org.junit.Assert.*;

public class GeneratedAddDecimalColumnTest {

    @Test
    public void addDecimalColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addDecimalColumn("Column6");
        assertTrue(dataFrame.hasColumn("Column6"));
    }

}