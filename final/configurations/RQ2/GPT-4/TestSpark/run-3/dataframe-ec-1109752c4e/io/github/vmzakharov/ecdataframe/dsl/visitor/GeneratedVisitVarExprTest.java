package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.*;

public class GeneratedVisitVarExprTest {

    @Test
    public void visitVarExprTest() {
        VarExpr varExpr = Mockito.mock(VarExpr.class);
        PrettyPrintVisitor expr = new PrettyPrintVisitor();
        expr.visitVarExpr(varExpr);

        // Add assertions as necessary in order to test the functionality of your method
    }

}