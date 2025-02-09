package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitProjectionExprTest {

    @Test
    public void visitProjectionExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        ProjectionExpr projectionExpr = new ProjectionExpr(new VarExpr("var"), new DecimalExpr(10));
        visitor.visitProjectionExpr(projectionExpr);
        Assert.assertEquals("( var ~ 10 )", visitor.toString());
    }

}