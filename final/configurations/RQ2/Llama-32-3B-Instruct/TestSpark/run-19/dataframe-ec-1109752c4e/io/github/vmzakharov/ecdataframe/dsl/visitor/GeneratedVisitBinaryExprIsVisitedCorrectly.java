package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitBinaryExprIsVisitedCorrectly {

    @Test
    public void visitBinaryExprIsVisitedCorrectly() {
        BinaryExpr expr = new BinaryExpr(1, 2, "+");
        io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitBinaryExpr(expr);
        assertEquals("1+2", io.github.vmzakharov.ecdataframe.util.CollectingPrinter.print());
    }

}