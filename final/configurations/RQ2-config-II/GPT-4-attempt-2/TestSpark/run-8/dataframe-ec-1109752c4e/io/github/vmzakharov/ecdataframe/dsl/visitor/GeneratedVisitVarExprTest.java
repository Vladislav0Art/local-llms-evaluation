package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitVarExprTest {

    @Test
    public void visitVarExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        VarExpr varExpr = new VarExpr("var");
        visitor.visitVarExpr(varExpr);
        Assert.assertEquals("var", visitor.toString());
    }

}