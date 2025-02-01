package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.DecimalValue;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        UnaryExpr expr = new UnaryExpr(new DecimalExpr(new LongConst(1), new LongConst(2)), Operation.NOT);
        String resStr = "(NOT(1, 2))";
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitUnaryExpr(expr);
        Assert.assertEquals(resStr, visitor.toString());
    }

}