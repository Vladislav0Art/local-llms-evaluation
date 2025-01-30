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

public class GeneratedVisitUnaryExprTrueTest {

    @Test
    public void visitUnaryExprTrueTest() {
        CollectingPrinter printer = new CollectingPrinter();
        new PrettyPrintVisitor(printer)
                .visitUnaryExpr(new UnaryExpr(Operation.NOT, new ValueExpr(Value.newBool(true))));

        Assert.assertEquals("!(true)", printer.toString());
    }

}