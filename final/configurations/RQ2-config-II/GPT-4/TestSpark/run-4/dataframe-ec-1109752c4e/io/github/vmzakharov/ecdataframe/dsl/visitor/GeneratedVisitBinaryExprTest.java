package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        CollectingPrinter collectingPrinter = new CollectingPrinter();
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor(collectingPrinter);
        BinaryExpr binaryExpr = new BinaryExpr(new VarExpr("a"), new DecimalExpr(new DecimalValue(100)), BinaryOp.ADD);
        prettyPrintVisitor.visitBinaryExpr(binaryExpr);
        Assert.assertEquals("a + 100", collectingPrinter.getBuffer().toString());
    }

}