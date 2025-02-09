package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        CollectingPrinter collectingPrinter = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(collectingPrinter);
        UnaryExpr expr = new UnaryExpr(Operation.NEGATIVE, new ConstExpr(5));
        visitor.visitUnaryExprTest(expr);

        Assert.assertEquals("-5", collectingPrinter.getBufferedPrint());
    }

}