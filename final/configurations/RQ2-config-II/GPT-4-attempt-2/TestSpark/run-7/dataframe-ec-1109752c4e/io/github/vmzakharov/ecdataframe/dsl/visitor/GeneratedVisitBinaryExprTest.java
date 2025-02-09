package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr expr = mock(BinaryExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        visitor.visitBinaryExpr(expr);
        Assert.assertNotNull(visitor);
    }

}