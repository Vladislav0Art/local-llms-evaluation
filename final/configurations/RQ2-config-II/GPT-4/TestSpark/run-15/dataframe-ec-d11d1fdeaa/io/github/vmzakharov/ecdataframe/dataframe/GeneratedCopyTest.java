package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.primitive.LongLists;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class GeneratedCopyTest {

    @Test
    public void copyTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("Name");
        dataFrame.addRow("John Doe");
        DataFrame copiedFrame = dataFrame.copy("CopiedTest");
        assertEquals("CopiedTest", copiedFrame.getName());
        assertEquals(1, copiedFrame.columnCount());
        assertEquals("Name", copiedFrame.getColumnAt(0).getName());
        assertEquals(1, copiedFrame.rowCount());
        assertEquals("John Doe", copiedFrame.getString("Name", 0));
    }

}