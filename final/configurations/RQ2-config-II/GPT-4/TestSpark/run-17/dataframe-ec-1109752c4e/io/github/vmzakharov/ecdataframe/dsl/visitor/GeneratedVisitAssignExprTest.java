package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        CollectingPrinter collectingPrinter = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(collectingPrinter);
        AssingExpr assignExpr = new AssingExpr(null, "a", new DecimalExpr(null, new BigDecimal(10)));
        visitor.visitAssignExpr(assignExpr);
        Assert.assertEquals("a = 10", collectingPrinter.getBufferAsString());
    }

}