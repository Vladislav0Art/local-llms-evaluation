package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitPropertyPathExprTest {

    @Test
    public void visitPropertyPathExprTest() {
        PropertyPathExpr expr = Mockito.mock(PropertyPathExpr.class);
        Mockito.when(expr.asPathString()).thenReturn("my.test");
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        prettyPrintVisitor.visitPropertyPathExpr(expr);
        assertEquals("my.test", PrettyPrintVisitor.exprToString(expr));
    }

}