package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.ExpressionVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitAliasExprTest {

    @Test
    public void visitAliasExprTest() {
        AliasExpr expr = new AliasExpr("a", new VarExpr("x"));
        assertEquals("a : x", PrettyPrintVisitor.exprToString(expr));
    }

}