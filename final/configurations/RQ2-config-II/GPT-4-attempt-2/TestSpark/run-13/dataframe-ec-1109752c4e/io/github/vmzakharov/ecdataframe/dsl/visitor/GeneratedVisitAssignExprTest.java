package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        AssingExpr expr = new AssingExpr("varX", "ExprX");
        visitor.visitAssignExpr(expr);
        Assert.assertEquals("varX := ExprX", visitor.toString());
    }

}