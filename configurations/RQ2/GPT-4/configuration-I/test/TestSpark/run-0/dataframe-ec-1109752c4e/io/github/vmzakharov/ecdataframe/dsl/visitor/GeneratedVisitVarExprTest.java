package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitVarExprTest {

    @Test
    public void visitVarExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        VarExpr expr = new VarExpr();
        visitor.visitVarExpr(expr);
        assertEquals(VarExpr.class, expr.getClass());
    }

}