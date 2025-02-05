package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.mockito.Mockito.mock;

public class GeneratedVisitAssignExprTest {

    @Test
    public void VisitAssignExprTest() {
        Printer printer = mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        AssingExpr expr = new AssingExpr(new VarExpr("x"), new VarExpr("t"));
        visitor.visitAssignExpr(expr);
        Assert.assertEquals("x = t", visitor.exprToString(expr));
    }

}