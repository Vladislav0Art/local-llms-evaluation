package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        CollectingPrinter collectingPrinter = new CollectingPrinter();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(collectingPrinter);
        BinaryExpr expr = new BinaryExpr(Operation.ADDITION, new ConstExpr(1), new ConstExpr(2));
        visitor.visitBinaryExpr(expr);

        Assert.assertEquals("1 + 2", collectingPrinter.getBufferedPrint());
    }

}