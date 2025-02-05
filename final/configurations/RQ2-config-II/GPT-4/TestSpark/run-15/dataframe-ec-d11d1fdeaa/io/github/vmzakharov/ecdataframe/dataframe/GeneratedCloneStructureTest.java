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

public class GeneratedCloneStructureTest {

    @Test
    public void cloneStructureTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("Name");
        DataFrame clonedFrame = dataFrame.cloneStructure("ClonedTest");
        assertEquals("ClonedTest", clonedFrame.getName());
        assertEquals(1, clonedFrame.columnCount());
        assertEquals("Name", clonedFrame.getColumnAt(0).getName());
    }

}