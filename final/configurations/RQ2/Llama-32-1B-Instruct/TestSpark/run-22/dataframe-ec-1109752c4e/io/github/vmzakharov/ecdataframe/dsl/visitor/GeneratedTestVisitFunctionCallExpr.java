package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestVisitFunctionCallExpr {

    @Test
    public void testVisitFunctionCallExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression functionCallExpr = new FunctionCallExpr("add", new VarExpr("x"), new VectorExpr(new IntExpr(2)));
        visitor.visitFunctionCallExpr(functionCallExpr);
        assertMocked(visitor.printer, Value.create("add"));
    }

}