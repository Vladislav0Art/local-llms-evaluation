package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestVisitPropertyPathExpr_PropertyAccess {

    @Test
    public void testVisitPropertyPathExpr_PropertyAccess() {
        PropertyPathExpr expr = new PropertyPathExpr("key");
        Value value = Mockito.mock(Value.class);
        expr.setPropertyPath(value.get());
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitPropertyPathExpr(expr);
    }

}