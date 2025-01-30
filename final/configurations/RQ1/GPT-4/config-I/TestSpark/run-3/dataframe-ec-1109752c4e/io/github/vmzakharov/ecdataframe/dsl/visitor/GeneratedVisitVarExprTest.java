package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import io.github.vmzakharov.ecdataframe.dsl.Value;
import io.github.vmzakharov.ecdataframe.dsl.Expression;
import io.github.vmzakharov.ecdataframe.dsl.function.FunctionScript;

public class GeneratedVisitVarExprTest {

    @Test
    public void visitVarExprTest() {
        VarExpr varExpression = mock(VarExpr.class);
        when(varExpression.getVariableName()).thenReturn("varName");
        when(varExpression.isEscaped()).thenReturn(false);

        PrettyPrintVisitor printer = new PrettyPrintVisitor();
        printer.visitVarExpr(varExpression);

        String result = printer.printer.toString();
        assertEquals("varName", result);
    }

}