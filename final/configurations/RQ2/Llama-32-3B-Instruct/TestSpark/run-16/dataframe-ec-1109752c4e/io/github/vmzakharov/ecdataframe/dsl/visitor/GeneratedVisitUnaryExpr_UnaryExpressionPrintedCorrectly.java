package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitUnaryExpr_UnaryExpressionPrintedCorrectly {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();

    @Test
    public void visitUnaryExpr_UnaryExpressionPrintedCorrectly() {
        UnaryExpr expr = new UnaryExpr(new VarExpr("x"), "-");
        visitor.visit(expr);
    }

    private String exprToString(Expression e) {
        PrettyPrintVisitor.PrettyPrintVisitor printer = new PrettyPrintVisitor();
        printer.visit(e);
        return printer.getPrinter().toString();
    }
}

}