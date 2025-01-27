package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAssignExprIsVisitedCorrectly {

    @Test
    public void visitAssignExprIsVisitedCorrectly() {
        AssigningExpr expr = new AssigningExpr(1, 2);
        io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAssignExpr(expr);
        assertEquals("1=2", io.github.vmzakharov.ecdataframe.util.CollectingPrinter.print());
    }

}