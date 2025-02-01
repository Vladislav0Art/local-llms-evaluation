package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.ExpressionVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAnonymousScriptExprTest {

    @Test
    public void visitAnonymousScriptExprTest() {
        AnonymousScript expr = new AnonymousScript();
        expr.addExpression(new VarExpr("x"));
        expr.addExpression(new VarExpr("y"));
        assertEquals("x\ny", PrettyPrintVisitor.exprToString(expr));
    }

}