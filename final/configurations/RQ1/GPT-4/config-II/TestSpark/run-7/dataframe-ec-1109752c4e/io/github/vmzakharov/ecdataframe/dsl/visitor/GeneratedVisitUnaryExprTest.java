package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        UnaryExpr expr = new UnaryExpr(UnaryExpr.Op.NOT, new VarExpr("var1"));
        visitor.visitUnaryExpr(expr);
        assertEquals("!(var1)", printer.toString());
    }

}