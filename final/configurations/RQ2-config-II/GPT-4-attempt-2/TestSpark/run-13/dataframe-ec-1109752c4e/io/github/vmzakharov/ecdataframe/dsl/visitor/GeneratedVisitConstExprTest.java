package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitConstExprTest {

    @Test
    public void visitConstExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Value value = new BooleanExpr(true);
        visitor.visitConstExpr(value);
        Assert.assertEquals("true", visitor.toString());
    }

}