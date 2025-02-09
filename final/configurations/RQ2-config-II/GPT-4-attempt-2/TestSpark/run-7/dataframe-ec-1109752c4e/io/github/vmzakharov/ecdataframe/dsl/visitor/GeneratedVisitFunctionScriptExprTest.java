package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedVisitFunctionScriptExprTest {

    @Test
    public void visitFunctionScriptExprTest() {
        FunctionScript expr = mock(FunctionScript.class);
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new CollectingPrinter());
        visitor.visitFunctionScriptExpr(expr);
        Assert.assertNotNull(visitor);
    }

}