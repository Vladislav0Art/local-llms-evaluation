package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import io.github.vmzakharov.ecdataframe.dsl.Value;
import io.github.vmzakharov.ecdataframe.dsl.Expression;
import io.github.vmzakharov.ecdataframe.dsl.function.FunctionScript;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression mockExpression = mock(Expression.class);
        when(mockExpression.evaluate(any())).thenReturn(Value.asStringLiteral("Mock"));

        String result = PrettyPrintVisitor.exprToString(mockExpression);

        assertEquals("Mock", result);
    }

}