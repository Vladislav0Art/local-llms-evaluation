package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        CollectingPrinter collectingPrinter = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(collectingPrinter);
        AssingExpr expr = new AssingExpr(new VarExpr("x"), new ConstExpr(10));
        visitor.visitAssignExpr(expr);

        Assert.assertEquals("x := 10", collectingPrinter.getBufferedPrint());
    }

}