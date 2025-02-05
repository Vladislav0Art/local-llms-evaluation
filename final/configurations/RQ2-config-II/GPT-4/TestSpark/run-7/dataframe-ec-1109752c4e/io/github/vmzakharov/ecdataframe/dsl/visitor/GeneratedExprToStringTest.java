package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression expressionMock = Mockito.mock(Expression.class);
        String result = PrettyPrintVisitor.exprToString(expressionMock);
        assertNotNull(result);
    }

}