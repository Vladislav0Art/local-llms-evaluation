package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedVisitIfElseExprTest {

    @Test
    public void visitIfElseExprTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        IfElseExpr ifElseExpr = new IfElseExpr(new BinaryExpr(new VarExpr("var"), ">", new DecimalExpr(10)), new DecimalExpr(1), new DecimalExpr(-1));
        visitor.visitIfElseExpr(ifElseExpr);
        Assert.assertEquals("if ( var > 10 ) then 1 else -1 end", visitor.toString());
    }

}