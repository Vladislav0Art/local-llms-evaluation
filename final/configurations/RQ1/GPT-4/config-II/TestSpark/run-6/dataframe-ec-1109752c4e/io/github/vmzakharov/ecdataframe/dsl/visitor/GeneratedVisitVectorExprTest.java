package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedVisitVectorExprTest {

    @Test
    public void visitVectorExprTest() {
        VectorExpr vectorExpr = mock(VectorExpr.class);
        vectorExpr.visit(new PrettyPrintVisitor(vectorExpr, false));
        String expectResult = "(VectorExpr)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(vectorExpr));
    }

}