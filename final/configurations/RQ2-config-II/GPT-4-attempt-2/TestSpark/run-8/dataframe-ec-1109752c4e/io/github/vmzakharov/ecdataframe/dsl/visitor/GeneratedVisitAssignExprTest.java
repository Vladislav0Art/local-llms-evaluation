package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        AssingExpr assignExpr = new AssingExpr(new VarExpr("var"), new DecimalExpr(10));
        visitor.visitAssignExpr(assignExpr);
        Assert.assertEquals("var = 10", visitor.toString());
    }

}