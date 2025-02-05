package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitFunctionScriptExprTest {

    @Test
    public void visitFunctionScriptExprTest() {
        FunctionScript functionScript = Mockito.mock(FunctionScript.class);
        Mockito.doCallRealMethod().when(functionScript).accept(Mockito.any());

        functionScript.accept(new PrettyPrintVisitor());
        Mockito.verify(functionScript, Mockito.times(1)).accept(Mockito.any());
    }

}