package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import io.github.vmzakharov.ecdataframe.dsl.AssingExpr;
import io.github.vmzakharov.ecdataframe.dsl.Expression;
import io.github.vmzakharov.ecdataframe.dsl.FunctionScript;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;

public class GeneratedTest {

    @Test
    public void visitAssignExprTest() {
        AssingExpr assigningExpression = mock(AssingExpr.class);
        when(assigningExpression.getVarName()).thenReturn("name");
        when(assigningExpression.isEscaped()).thenReturn(false);
        when(assigningExpression.getExpression()).thenReturn(new StringValue("Mock"));

        CollectingPrinter cp = new CollectingPrinter();
        PrettyPrintVisitor printer = new PrettyPrintVisitor(cp);
        assigningExpression.accept(printer);

        String result = cp.toString();
        assertEquals("name = 'Mock'\n", result);
    }

    @Test
    public void visitFunctionScriptExprTest() {
        FunctionScript functionScriptExpression = mock(FunctionScript.class);
        when(functionScriptExpression.getName()).thenReturn("func");

        CollectingPrinter cp = new CollectingPrinter();
        PrettyPrintVisitor printer = new PrettyPrintVisitor(cp);
        functionScriptExpression.accept(printer);

        String result = cp.toString();
        assertEquals("function func\n{\n}\n", result);
    }

}