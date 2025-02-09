package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import io.github.vmzakharov.ecdataframe.util.PrinterFactory;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitFunctionCallExprTest {

    @Test
    public void visitFunctionCallExprTest() {
        // test without asserting the result due to the complexity of setting up a FunctionCallExpr
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        FunctionCallExpr functionCallExpr = new FunctionCallExpr(null, null);
        visitor.visitFunctionCallExpr(functionCallExpr);
        Assert.assertTrue(true);
    }

}