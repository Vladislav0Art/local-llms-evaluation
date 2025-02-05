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

public class GeneratedSetValueTest {

    @Test
    public void setValueTest() {
        DataFrame dataFrame = new DataFrame("DataFrame1");
        dataFrame.addStringColumn("ColumnString");
        dataFrame.addRow();
        Assert.assertEquals("", dataFrame.getString("ColumnString", 0));

        dataFrame.setValue(0, 0, new Value("test", java.lang.String.class));
        Assert.assertEquals("test", dataFrame.getString("ColumnString", 0));
    }

}