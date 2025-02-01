package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedVisitFunctionCallExprTest {

    @Test
    public void visitFunctionCallExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        FunctionCallExpr expr = new FunctionCallExpr("sum", new VarExpr("var1"), new VarExpr("var2"));
        visitor.visitFunctionCallExpr(expr);
        assertEquals("sum(var1, var2)", printer.toString());
    }

}