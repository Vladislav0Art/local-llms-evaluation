package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.FunctionScript.FunctionMethod;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.Maps;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitDecimalExprTest {

    @Test
    public void visitDecimalExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        new PrettyPrintVisitor(printer)
                .visitDecimalExpr(new DecimalExpr(
                        new ValueExpr(Value.newInt(10000)),
                        new ValueExpr(Value.newInt(3))));

        Assert.assertEquals("[10000,3]", printer.toString());
    }

}