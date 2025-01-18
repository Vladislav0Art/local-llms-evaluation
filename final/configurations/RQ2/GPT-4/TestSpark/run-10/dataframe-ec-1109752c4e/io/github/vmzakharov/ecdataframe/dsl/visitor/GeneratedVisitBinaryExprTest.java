package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import io.github.vmzakharov.ecdataframe.dsl.*;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        Expression leftExpression = new VarExpr("leftTest", false);
        Expression rightExpression = new VarExpr("rightTest", false);
        BinaryExpr binaryExpr = new BinaryExpr(leftExpression, rightExpression, BinaryOp.EQ);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitBinaryExpr(binaryExpr);
    }

}