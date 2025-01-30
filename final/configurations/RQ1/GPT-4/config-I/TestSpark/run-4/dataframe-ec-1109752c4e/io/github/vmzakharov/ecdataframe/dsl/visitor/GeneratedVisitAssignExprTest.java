package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitAssignExprTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr assignExpr = new AssingExpr(null, "total", new ConstExpr(null, Value.stringValueOf("true")), false);
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor prettyPrinter = new PrettyPrintVisitor(printer);
        assignExpr.accept(prettyPrinter);
        Assert.assertEquals("total = \"true\"", printer.toString());
    }

}