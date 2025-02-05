package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.Printer;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.mockito.Mockito.mock;

public class GeneratedVisitIfElseExprTest {

    @Test
    public void VisitIfElseExprTest() {
        Printer printer = mock(Printer.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        IfElseExpr expr = new IfElseExpr(new VarExpr("x"), new VarExpr("y"), new VarExpr("z"));
        visitor.visitIfElseExpr(expr);
        Assert.assertEquals("if x then y else z", visitor.exprToString(expr));
    }

}