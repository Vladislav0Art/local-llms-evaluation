package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitIfElseExprTest {

    @Test
    public void visitIfElseExprTest() {
        IfElseExpr ifElseExpr = new IfElseExpr(null,
                new ConstExpr(null, Value.stringValueOf("true")),
                new ConstExpr(null, Value.stringValueOf("true")),
                new ConstExpr(null, Value.stringValueOf("false")));

        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor prettyPrinter = new PrettyPrintVisitor(printer);
        ifElseExpr.accept(prettyPrinter);
        Assert.assertEquals("\"true\" ? \"true\" : \"false\"", printer.toString());
    }

}