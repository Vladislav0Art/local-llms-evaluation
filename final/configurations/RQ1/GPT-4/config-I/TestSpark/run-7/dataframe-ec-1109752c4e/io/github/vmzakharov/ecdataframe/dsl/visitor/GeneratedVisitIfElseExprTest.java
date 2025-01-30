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

public class GeneratedVisitIfElseExprTest {

    @Test
    public void visitIfElseExprTest() {
        CollectingPrinter printer = new CollectingPrinter();
        new PrettyPrintVisitor(printer).visitIfElseExpr(new IfElseExpr(
                new ValueExpr(Value.newBool(true)),
                new ValueExpr(Value.newInt(100)),
                new ValueExpr(Value.newDecimal(200))
        ));

        Assert.assertEquals("true ? 100 : 200", printer.toString());
    }

}