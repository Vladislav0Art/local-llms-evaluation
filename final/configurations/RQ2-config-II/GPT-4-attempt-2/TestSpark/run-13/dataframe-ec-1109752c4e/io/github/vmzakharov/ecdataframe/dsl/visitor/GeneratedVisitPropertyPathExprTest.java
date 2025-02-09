package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitPropertyPathExprTest {

    @Test
    public void visitPropertyPathExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        PropertyPathExpr expr = new PropertyPathExpr("somePath");
        visitor.visitPropertyPathExpr(expr);
        Assert.assertEquals("obj.somePath", visitor.toString());
    }

}