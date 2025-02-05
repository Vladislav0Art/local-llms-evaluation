package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.mockito.Mockito.mock;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void VisitUnaryExprTest() {
        Printer printer = mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        UnaryExpr expr = new UnaryExpr(UnaryOp.NOT, new VarExpr("a"));
        visitor.visitUnaryExpr(expr);
        Assert.assertEquals("!a", visitor.exprToString(expr));
    }

}