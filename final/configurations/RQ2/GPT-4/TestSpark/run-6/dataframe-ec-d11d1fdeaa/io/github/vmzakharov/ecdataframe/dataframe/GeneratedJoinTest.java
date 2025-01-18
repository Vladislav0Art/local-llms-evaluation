package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import org.eclipse.collections.api.list.primitive.MutableBooleanList;
import org.eclipse.collections.impl.factory.primitive.BooleanLists;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class GeneratedJoinTest {

    @Test
    public void joinTest() {
        DataFrame dataFrame1 = new DataFrame("TestName1");
        dataFrame1.addStringColumn("Column1");
        dataFrame1.addRow(new StringValue("XYZ"));

        DataFrame dataFrame2 = new DataFrame("TestName2");
        dataFrame2.addStringColumn("Column1");
        dataFrame2.addRow(new StringValue("XYZ"));

        DataFrame joinedDataFrame = dataFrame1.join(dataFrame2, "Column1", "Column1");

        Assert.assertEquals(2, joinedDataFrame.columnCount());
    }

}