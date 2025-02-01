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

public class GeneratedVisitVectorExprTest {

    @Test
    public void visitVectorExprTest() {
        VectorExpr vectorExpr = new VectorExpr(Lists.mutable.of(new LongValue(123L), new LongValue(456L)));
        String prettyPrint = PrettyPrintVisitor.exprToString(vectorExpr);
        Assert.assertEquals("(123, 456)", prettyPrint);
    }

}