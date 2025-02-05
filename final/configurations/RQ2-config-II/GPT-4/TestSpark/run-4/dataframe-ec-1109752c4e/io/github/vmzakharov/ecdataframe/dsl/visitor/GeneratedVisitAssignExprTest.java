package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        CollectingPrinter collectingPrinter = new CollectingPrinter();
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(collectingPrinter);
        AssingExpr assingExpr = new AssingExpr(new VarExpr("a"), new DecimalExpr(new DecimalValue(5)));
        prettyPrintVisitor.visitAssignExpr(assingExpr);
        Assert.assertEquals("a = 5", collectingPrinter.getBuffer().toString());
    }

}