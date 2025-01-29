package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestVisitVarExpr {

    @Test
    public void testVisitVarExpr() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression varExpr = new VarExpr("y");
        visitor.visitVarExpr(varExpr);
        assertMocked(visitor.printer, Value.create("y"));
    }

}