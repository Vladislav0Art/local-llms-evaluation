package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.mockito.Mockito.*;

public class GeneratedEvaluateExpressionTest {

    @Test
    public void evaluateExpressionTest() {
        DataFrame data = new DataFrame("test");
        data.addLongColumn("value", Lists.immutable.of(8L, 7L, 6L, 3L));
        ExpressionParserHelper helper = new ExpressionParserHelper();
        Value result = data.evaluateExpression(helper.compileExpression("value * 2"), 1);
        Assert.assertEquals(Long.valueOf(14), result.longValue());
    }

}