package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.factory.Lists;

import static org.junit.Assert.*;

public class GeneratedJoinTest {

    @Test
    public void JoinTest() {
        DataFrame dataFrame1 = new DataFrame("Test1");
        DataFrame dataFrame2 = new DataFrame("Test2");
        dataFrame1.addStringColumn("CommonColumn");
        dataFrame1.addRow("value1");
        dataFrame2.addStringColumn("CommonColumn");
        dataFrame2.addRow("value1");
        DataFrame joinedDataFrame = dataFrame1.join(dataFrame2, "CommonColumn", "CommonColumn");
        assertEquals(2, joinedDataFrame.columnCount());
    }

}