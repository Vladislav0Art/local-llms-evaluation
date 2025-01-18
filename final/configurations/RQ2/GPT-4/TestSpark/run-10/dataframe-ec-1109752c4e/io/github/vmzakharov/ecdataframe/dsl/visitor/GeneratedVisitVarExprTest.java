package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import io.github.vmzakharov.ecdataframe.dsl.*;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitVarExprTest {

    @Test
    public void visitVarExprTest() {
        VarExpr varExpr = new VarExpr("VarExprTest", false);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitVarExpr(varExpr);
    }

}