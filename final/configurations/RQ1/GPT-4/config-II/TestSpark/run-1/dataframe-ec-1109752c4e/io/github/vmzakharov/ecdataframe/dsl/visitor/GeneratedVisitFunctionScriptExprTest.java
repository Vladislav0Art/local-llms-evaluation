package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.ExpressionVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitFunctionScriptExprTest {

    @Test
    public void visitFunctionScriptExprTest() {
        FunctionScript expr = new FunctionScript("myFunction");
        expr.addParameter("x");
        expr.addExpression(new VarExpr("x"));
        assertEquals("function myFunction(x)\n{\n  x\n}", PrettyPrintVisitor.exprToString(expr));
    }

}