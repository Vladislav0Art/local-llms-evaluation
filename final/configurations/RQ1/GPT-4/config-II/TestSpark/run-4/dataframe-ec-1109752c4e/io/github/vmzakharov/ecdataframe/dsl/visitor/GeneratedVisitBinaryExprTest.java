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

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr binaryExpr = new BinaryExpr(new LongValue(123L), new DecimalValue(456.789D), BinaryOp.MUL);
        String prettyPrint = PrettyPrintVisitor.exprToString(binaryExpr);
        Assert.assertEquals("(123 * 456.789)", prettyPrint);
    }

}