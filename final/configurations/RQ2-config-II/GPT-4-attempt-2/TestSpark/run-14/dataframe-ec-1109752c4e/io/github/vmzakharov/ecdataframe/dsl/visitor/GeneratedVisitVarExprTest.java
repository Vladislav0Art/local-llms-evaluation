package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitVarExprTest {

    @Test
    public void visitVarExprTest() {
        VarExpr expr = Mockito.mock(VarExpr.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitVarExpr(expr);
    }

}