package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.when;

public class GeneratedEvaluateExpressionTest {

    @Test
    public void evaluateExpressionTest() {
        DataFrame df = Mockito.spy(new DataFrame("Test"));
        Expression expr = Mockito.mock(Expression.class);
        when(df.evaluateExpression(expr, 0)).thenReturn(Value.of("test"));
        assertEquals("test", df.evaluateExpression(expr, 0).asStringLiteral());
        Mockito.verify(df).evaluateExpression(expr, 0);
    }

}