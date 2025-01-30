package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedExprToStringUnaryExprTest {

    @Test
    public void exprToStringUnaryExprTest() {
        UnaryExpr unaryExpr = new UnaryExpr(null, UnaryOp.NOT, new ConstBool(null, true));
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor prettyPrinter = new PrettyPrintVisitor(printer);
        unaryExpr.accept(prettyPrinter);
        Assert.assertEquals("!(true)", printer.toString());
    }

}