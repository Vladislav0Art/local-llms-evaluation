package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        CollectingPrinter collectingPrinter = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(collectingPrinter);
        VarExpr varExpr = new VarExpr(null, "varExprTest");
        UnaryExpr unaryExpr = new UnaryExpr(null, UnaryOp.MINUS, varExpr);
        visitor.visitUnaryExpr(unaryExpr);
        Assert.assertEquals("-varExprTest", collectingPrinter.getBufferAsString());
    }

}