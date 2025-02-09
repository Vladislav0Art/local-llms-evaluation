package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.SimpleValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitFunctionCallExprTest {

    @Test
    public void visitFunctionCallExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        FunctionCallExpr expr = new FunctionCallExpr("testFunc", new SimpleValue("5"));
        visitor.visitFunctionCallExpr(expr);
        assertEquals("testFunc(\"5\")", visitor.toString());
    }

}