package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.ExpressionVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitIfElseExprTest {

    @Test
    public void visitIfElseExprTest() {
        IfElseExpr expr = new IfElseExpr(
                new BinaryExpr(new VarExpr("x"), Operation.GREATER_THAN, new VarExpr("y")),
                new StatementSequenceScript(new ValueExpr("10")),
                new StatementSequenceScript(new ValueExpr("20")),
                false);
        assertEquals("if (x > y) then\n  10\nelse\n  20\nendif", PrettyPrintVisitor.exprToString(expr));
    }

}