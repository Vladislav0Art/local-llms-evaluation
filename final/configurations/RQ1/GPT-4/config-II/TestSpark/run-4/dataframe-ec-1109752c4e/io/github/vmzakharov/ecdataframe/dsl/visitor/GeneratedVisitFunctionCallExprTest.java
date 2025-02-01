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

public class GeneratedVisitFunctionCallExprTest {

    @Test
    public void visitFunctionCallExprTest() {
        FunctionCallExpr functionCallExpr = new FunctionCallExpr("functionName1", Lists.mutable.of(new LongValue(246L), new DecimalValue(741.852D)));
        String prettyPrint = PrettyPrintVisitor.exprToString(functionCallExpr);
        Assert.assertEquals("functionName1(246, 741.852)", prettyPrint);
    }

}