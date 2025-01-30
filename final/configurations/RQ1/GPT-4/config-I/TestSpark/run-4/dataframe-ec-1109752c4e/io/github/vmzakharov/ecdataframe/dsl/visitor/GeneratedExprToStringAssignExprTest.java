package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedExprToStringAssignExprTest {

    @Test
    public void exprToStringAssignExprTest() {
        AssignExpr assignExpr = new AssignExpr(null, "total", new ConstBool(null, true));
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor prettyPrinter = new PrettyPrintVisitor(printer);
        assignExpr.accept(prettyPrinter);
        Assert.assertEquals("total = true", printer.toString());
    }

}