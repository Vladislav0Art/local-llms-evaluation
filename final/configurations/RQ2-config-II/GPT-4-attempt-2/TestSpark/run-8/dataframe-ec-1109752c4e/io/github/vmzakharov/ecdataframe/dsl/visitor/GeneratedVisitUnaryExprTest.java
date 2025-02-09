package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        UnaryExpr unaryExpr = new UnaryExpr("-", new DecimalExpr(10));
        visitor.visitUnaryExpr(unaryExpr);
        Assert.assertEquals("- 10", visitor.toString());
    }

}