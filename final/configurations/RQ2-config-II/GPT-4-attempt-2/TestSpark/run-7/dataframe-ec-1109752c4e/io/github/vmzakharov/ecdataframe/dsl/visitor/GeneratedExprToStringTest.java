package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression expr = mock(Expression.class);
        Assert.assertNotNull(PrettyPrintVisitor.exprToString(expr));
    }

}