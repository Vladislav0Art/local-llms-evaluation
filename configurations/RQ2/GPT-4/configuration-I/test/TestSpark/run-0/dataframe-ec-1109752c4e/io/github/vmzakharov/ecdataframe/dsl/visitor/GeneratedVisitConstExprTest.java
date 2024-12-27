package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Value expr = new Value();
        visitor.visitConstExpr(expr);
        assertEquals(Value.class, expr.getClass());
    }

}