package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedExprToStringIfElseExprTest {

    @Test
    public void exprToStringIfElseExprTest() {
        IfElseExpr ifElseExpr = new IfElseExpr(null,
                new ConstBool(null, true),
                new ConstBool(null, true),
                new ConstBool(null, false));

        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor prettyPrinter = new PrettyPrintVisitor(printer);
        ifElseExpr.accept(prettyPrinter);
        Assert.assertEquals("true ? true : false", printer.toString());
    }

}