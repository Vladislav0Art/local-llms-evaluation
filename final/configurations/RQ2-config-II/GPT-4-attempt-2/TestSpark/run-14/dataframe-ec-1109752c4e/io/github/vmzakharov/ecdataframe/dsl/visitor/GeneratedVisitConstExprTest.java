package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        Value expr = Mockito.mock(Value.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitConstExpr(expr);
    }

}