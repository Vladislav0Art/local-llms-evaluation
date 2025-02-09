package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression e = Mockito.mock(Expression.class);
        String result = PrettyPrintVisitor.exprToString(e);
        // Check something about the result based on your requirements/implementation
    }

}