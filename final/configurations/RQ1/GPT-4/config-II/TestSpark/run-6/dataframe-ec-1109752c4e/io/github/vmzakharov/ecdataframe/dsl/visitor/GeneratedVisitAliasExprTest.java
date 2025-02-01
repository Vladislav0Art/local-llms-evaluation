package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedVisitAliasExprTest {

    @Test
    public void visitAliasExprTest() {
        AliasExpr aliasExpr = mock(AliasExpr.class);
        aliasExpr.visit(new PrettyPrintVisitor(aliasExpr, false));
        String expectResult = "(AliasExpr)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(aliasExpr));
    }

}