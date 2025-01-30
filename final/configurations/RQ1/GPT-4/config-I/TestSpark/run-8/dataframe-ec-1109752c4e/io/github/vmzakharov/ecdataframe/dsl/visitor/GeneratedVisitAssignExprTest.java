package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueExpr;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;
import org.eclipse.collections.impl.list.mutable.FastList;

public class GeneratedVisitAssignExprTest {

    private String print(Expression expression) {
        CollectingPrinter printer = new CollectingPrinter();
        expression.accept(new PrettyPrintVisitor(printer));
        return printer.toString();
    }

    @Test
    public void visitAssignExprTest() {
        AssingExpr assignExpr = new AssingExpr("variable", new ValueExpr(new DecimalValue("5")));
        Assert.assertEquals("variable = 5", print(assignExpr));
    }

}