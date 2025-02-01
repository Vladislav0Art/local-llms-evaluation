package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.ExpressionVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitDecimalExprTest {

    @Test
    public void visitDecimalExprTest() {
        DecimalExpr expr = new DecimalExpr(new ValueExpr("100"), new ValueExpr("2"));
        assertEquals("[100,2]", PrettyPrintVisitor.exprToString(expr));
    }

}