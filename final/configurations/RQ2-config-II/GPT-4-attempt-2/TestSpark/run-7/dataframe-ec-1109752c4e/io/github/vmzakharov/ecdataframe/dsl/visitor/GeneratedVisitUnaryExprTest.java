package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr expr = mock(UnaryExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        visitor.visitUnaryExpr(expr);
        Assert.assertNotNull(visitor);
    }

}