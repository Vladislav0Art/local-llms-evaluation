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

public class GeneratedJoinTest {

    @Test
    public void joinTest() {
        DataFrame dataFrame1 = new DataFrame("Test1");
        DataFrame dataFrame2 = new DataFrame("Test2");

        dataFrame1.addLongColumn("ID");
        dataFrame1.addRow(LongLists.mutable.with(1));

        dataFrame2.addLongColumn("ID");
        dataFrame2.addRow(LongLists.mutable.with(1));

        DataFrame joinedFrame = dataFrame1.join(dataFrame2, Lists.mutable.with("ID"), Lists.mutable.with("ID"));
        assertEquals(dataFrame1.rowCount(), joinedFrame.columnCount());
    }

}