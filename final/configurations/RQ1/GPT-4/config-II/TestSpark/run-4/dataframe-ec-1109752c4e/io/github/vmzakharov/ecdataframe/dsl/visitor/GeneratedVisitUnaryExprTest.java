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

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr unaryExpr = new UnaryExpr(UnaryOpString.ADD, new LongValue(13L));
        String prettyPrint = PrettyPrintVisitor.exprToString(unaryExpr);
        Assert.assertEquals("+ ( 13 )", prettyPrint);

        unaryExpr = new UnaryExpr(UnaryOpString.SUB, new LongValue(15L));
        prettyPrint = PrettyPrintVisitor.exprToString(unaryExpr);
        Assert.assertEquals("- ( 15 )", prettyPrint);
    }

}