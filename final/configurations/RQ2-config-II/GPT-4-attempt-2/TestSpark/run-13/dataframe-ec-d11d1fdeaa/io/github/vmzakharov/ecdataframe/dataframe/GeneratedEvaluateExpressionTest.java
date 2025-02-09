package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.ExpressionParserHelper;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.tuple.Tuples;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedEvaluateExpressionTest {

    @Test
    public void evaluateExpressionTest() {
        Value expectedValue = Mockito.mock(Value.class);
        DataFrame mockDataFrame = Mockito.mock(DataFrame.class);
        Expression mockExpression = Mockito.mock(Expression.class);
        Mockito.when(mockDataFrame.evaluateExpression(mockExpression, 1)).thenReturn(expectedValue);
        Assert.assertEquals(expectedValue, mockDataFrame.evaluateExpression(mockExpression, 1));
    }

}