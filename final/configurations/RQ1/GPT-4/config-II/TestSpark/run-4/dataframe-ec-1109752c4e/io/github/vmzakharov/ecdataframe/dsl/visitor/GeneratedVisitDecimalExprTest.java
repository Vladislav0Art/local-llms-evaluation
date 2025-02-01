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

public class GeneratedVisitDecimalExprTest {

    @Test
    public void visitDecimalExprTest() {
        DecimalExpr decimalExpr = new DecimalExpr(new DecimalValue(741852963.12345D), new LongValue(2L));
        String prettyPrint = PrettyPrintVisitor.exprToString(decimalExpr);
        Assert.assertEquals("[741852963.12345, 2]", prettyPrint);
    }

}