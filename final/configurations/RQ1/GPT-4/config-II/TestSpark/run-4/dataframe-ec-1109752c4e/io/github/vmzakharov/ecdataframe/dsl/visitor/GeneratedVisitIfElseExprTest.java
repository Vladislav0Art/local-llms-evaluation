package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.dsl.value.LongValue;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.visitor.UnaryOpString;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitIfElseExprTest {

    @Test
    public void visitIfElseExprTest() {
        IfElseExpr ifElseExpr = new IfElseExpr(new LongValue(11L), new VarExpr("ifVar1"), new VarExpr("elseVar1"), true);
        String prettyPrint = PrettyPrintVisitor.exprToString(ifElseExpr);
        Assert.assertEquals("11 ? ifVar1 : elseVar1", prettyPrint);
    }

}