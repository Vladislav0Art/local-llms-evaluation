package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedVisitIndexExprTest {

    @Test
    public void visitIndexExprTest() {
        IndexExpr indexExpr = mock(IndexExpr.class);
        indexExpr.visit(new PrettyPrintVisitor(indexExpr, false));
        String expectResult = "(IndexExpr)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(indexExpr));
    }

}