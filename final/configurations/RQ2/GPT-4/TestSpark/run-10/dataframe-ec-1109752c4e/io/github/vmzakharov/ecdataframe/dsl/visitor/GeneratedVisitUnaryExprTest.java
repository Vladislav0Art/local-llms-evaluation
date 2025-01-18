package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import io.github.vmzakharov.ecdataframe.dsl.*;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitUnaryExprTest {

    @Test
    public void visitUnaryExprTest() {
        Expression expression = new VarExpr("TestUnaryExpr", false);
        UnaryExpr unaryExpr = new UnaryExpr(UnaryOp.NOT, expression);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitUnaryExpr(unaryExpr);
    }

}