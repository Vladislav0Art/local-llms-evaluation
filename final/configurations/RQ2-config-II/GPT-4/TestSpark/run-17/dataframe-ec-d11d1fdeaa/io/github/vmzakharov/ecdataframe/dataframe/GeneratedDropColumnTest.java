package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import io.github.vmzakharov.ecdataframe.dsl.EvalContext;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.api.list.primitive.MutableIntList;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GeneratedDropColumnTest {

    @Test
    public void dropColumnTest() {
        DataFrame dataFrame = new DataFrame("DataFrame1");
        dataFrame.addStringColumn("ColumnString");
        dataFrame.addRow();
        dataFrame.addStringColumn("AnotherColumnString");
        Assert.assertEquals(2, dataFrame.columnCount());
        Assert.assertEquals("ColumnString", dataFrame.getColumnAt(0).getName());

        dataFrame = dataFrame.dropColumn("ColumnString");
        Assert.assertEquals(1, dataFrame.columnCount());
        Assert.assertEquals("AnotherColumnString", dataFrame.getColumnAt(0).getName());
    }

}