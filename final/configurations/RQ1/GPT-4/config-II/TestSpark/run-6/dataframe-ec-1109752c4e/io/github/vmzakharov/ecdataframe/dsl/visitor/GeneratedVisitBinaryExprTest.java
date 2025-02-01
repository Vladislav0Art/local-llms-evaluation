package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedVisitBinaryExprTest {

    @Test
    public void visitBinaryExprTest() {
        BinaryExpr binaryExpr = mock(BinaryExpr.class);
        binaryExpr.visit(new PrettyPrintVisitor(binaryExpr, false));
        String expectResult = "(BinaryExpr)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(binaryExpr));
    }

}