package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestVisitVarExpr_VarAccess {

    @Test
    public void testVisitVarExpr_VarAccess() {
        VarExpr expr = new VarExpr("var");
        Value value = Mockito.mock(Value.class);
        expr.setVariable(value.get());
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitVarExpr(expr);
    }

}