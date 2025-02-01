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

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr expr = new BinaryExpr(new DecimalExpr(new LongConst(1), new LongConst(2)),
                Operation.ADD, new DecimalExpr(new LongConst(3), new LongConst(4)));
        String expectedString = "[(1, 2) + (3, 4)]";
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitBinaryExpr(expr);
        Assert.assertEquals(expectedString, visitor.toString());
    }

}