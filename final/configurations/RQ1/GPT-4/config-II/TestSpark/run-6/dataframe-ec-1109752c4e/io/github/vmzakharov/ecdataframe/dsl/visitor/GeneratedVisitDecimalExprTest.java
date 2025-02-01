package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedVisitDecimalExprTest {

    @Test
    public void visitDecimalExprTest() {
        DecimalExpr decimalExpr = mock(DecimalExpr.class);
        decimalExpr.visit(new PrettyPrintVisitor(decimalExpr, false));
        String expectResult = "(DecimalExpr)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(decimalExpr));
    }

}