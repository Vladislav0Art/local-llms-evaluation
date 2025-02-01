package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.ExpressionVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitFunctionCallExprTest {

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr expr = new FunctionCallExpr("myFunction", new VarExpr("x"), new VarExpr("y"));
        assertEquals("myFunction(x, y)", PrettyPrintVisitor.exprToString(expr));
    }

}