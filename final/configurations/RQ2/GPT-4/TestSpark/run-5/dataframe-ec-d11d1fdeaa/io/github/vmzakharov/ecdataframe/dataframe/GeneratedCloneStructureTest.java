package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.factory.Lists;

import static org.junit.Assert.*;

public class GeneratedCloneStructureTest {

    @Test
    public void CloneStructureTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("TestColumn");
        DataFrame clonedDataFrame = dataFrame.cloneStructure("Cloned");
        assertEquals(dataFrame.columnCount(), clonedDataFrame.columnCount());
        assertNotEquals(dataFrame.getName(), clonedDataFrame.getName());
    }

}