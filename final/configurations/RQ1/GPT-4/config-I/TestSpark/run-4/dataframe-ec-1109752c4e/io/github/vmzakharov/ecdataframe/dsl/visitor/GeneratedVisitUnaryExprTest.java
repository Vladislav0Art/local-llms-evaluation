package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr unaryExpr = new UnaryExpr(null, UnaryOp.NOT, new ConstExpr(null, Value.stringValueOf("true")));
        CollectingPrinter printer = new CollectingPrinter();
        PrettyPrintVisitor prettyPrinter = new PrettyPrintVisitor(printer);
        unaryExpr.accept(prettyPrinter);
        Assert.assertEquals("!(\"true\")", printer.toString());
    }

}