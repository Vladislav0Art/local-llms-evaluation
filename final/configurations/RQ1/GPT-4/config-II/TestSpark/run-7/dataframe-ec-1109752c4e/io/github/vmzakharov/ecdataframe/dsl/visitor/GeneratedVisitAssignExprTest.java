package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(printer);
        AssingExpr expr = new AssingExpr("var1", new StringValue("value1"));
        visitor.visitAssignExpr(expr);
        assertEquals("var1 = \"value1\"", printer.toString());
    }

}