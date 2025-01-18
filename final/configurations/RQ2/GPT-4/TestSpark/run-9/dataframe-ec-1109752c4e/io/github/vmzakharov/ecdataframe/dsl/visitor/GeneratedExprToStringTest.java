package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedExprToStringTest {

    @Test
    public void exprToStringTest() {
        Expression expression = Mockito.mock(Expression.class);

        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        expression.accept(visitor);

        Assert.assertNotNull(visitor.toString());
    }

}