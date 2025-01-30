package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueExpr;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;
import org.eclipse.collections.impl.list.mutable.FastList;

public class GeneratedVisitFunctionCallExprTest {

    private String print(Expression expression) {
        CollectingPrinter printer = new CollectingPrinter();
        expression.accept(new PrettyPrintVisitor(printer));
        return printer.toString();
    }

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr functionCallExpr = new FunctionCallExpr("produce",
                FastList.newListWith(new ValueExpr(new DecimalValue("5"))));
        Assert.assertEquals("produce(5)", print(functionCallExpr));
    }

}