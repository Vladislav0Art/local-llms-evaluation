package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
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

public class GeneratedEvaluateExpressionTest {

    @Test
    public void evaluateExpressionTest() {
        DataFrame dataFrame = new DataFrame("TestName");
        dataFrame.addLongColumn("Column1", Lists.mutable.with(100l, 200l));
        dataFrame.addLongColumn("Column2", Lists.mutable.with(10l, 20l));
        dataFrame.addColumn("Sum", ValueType.LONG, "Column1 + Column2");
        Assert.assertEquals(110l, dataFrame.getLong("Sum", 0));
        Assert.assertEquals(220l, dataFrame.getLong("Sum", 1));
    }

}