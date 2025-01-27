package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestVisitAliasExpr_Alias {

    @Test
    public void testVisitAliasExpr_Alias() {
        AliasExpr expr = new AliasExpr();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAliasExpr(expr);
    }

}