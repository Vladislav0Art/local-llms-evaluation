package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedExprToStringBinaryExprTest {

    @Test
    public void exprToStringBinaryExprTest() {
        BinaryExpr binaryExpr = new BinaryExpr(null, new ConstBool(null, true), BinaryOp.OR, new ConstBool(null, false));
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor prettyPrinter = new PrettyPrintVisitor(printer);
        binaryExpr.accept(prettyPrinter);
        Assert.assertEquals("(true || false)", printer.toString());
    }

}