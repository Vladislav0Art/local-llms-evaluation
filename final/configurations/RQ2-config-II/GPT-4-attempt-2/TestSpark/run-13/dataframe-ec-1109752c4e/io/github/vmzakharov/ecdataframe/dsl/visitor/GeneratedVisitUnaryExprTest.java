package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        UnaryExpr expr = new UnaryExpr(UnaryOp.NOT, new UnaryExpr(UnaryOp.NOT, new BooleanExpr(false)));
        visitor.visitUnaryExpr(expr);
        Assert.assertEquals("not not false", visitor.toString());
    }

}