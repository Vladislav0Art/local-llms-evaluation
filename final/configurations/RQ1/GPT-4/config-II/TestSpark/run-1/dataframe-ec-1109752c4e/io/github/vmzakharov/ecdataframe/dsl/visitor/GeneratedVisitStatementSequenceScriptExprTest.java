package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.ExpressionVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitStatementSequenceScriptExprTest {

    @Test
    public void visitStatementSequenceScriptExprTest() {
        StatementSequenceScript expr = new StatementSequenceScript();
        expr.addExpression(new VarExpr("x"));
        expr.addExpression(new VarExpr("y"));
        assertEquals("x\ny", PrettyPrintVisitor.exprToString(expr));
    }

}