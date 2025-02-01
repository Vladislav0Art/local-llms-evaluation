package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedVisitFunctionScriptExprTest {

    @Test
    public void visitFunctionScriptExprTest() {
        FunctionScript functionScript = mock(FunctionScript.class);
        functionScript.visit(new PrettyPrintVisitor(functionScript, false));
        String expectResult = "(FunctionScript)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(functionScript));
    }

}