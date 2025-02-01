package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        BinaryExpr expr = new BinaryExpr(new VarExpr("var1"), BinaryExpr.Op.ADD, new VarExpr("var2"));
        visitor.visitBinaryExpr(expr);
        assertEquals("(var1 + var2)", printer.toString());
    }

}