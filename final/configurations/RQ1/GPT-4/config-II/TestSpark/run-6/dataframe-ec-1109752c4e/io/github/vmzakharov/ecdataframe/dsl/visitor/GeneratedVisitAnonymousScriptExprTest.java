package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.PrettyPrintVisitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedVisitAnonymousScriptExprTest {

    @Test
    public void visitAnonymousScriptExprTest() {
        AnonymousScript anonymousScript = mock(AnonymousScript.class);
        anonymousScript.visit(new PrettyPrintVisitor(anonymousScript, false));
        String expectResult = "(AnonymousScript)";
        assertEquals(expectResult, PrettyPrintVisitor.exprToString(anonymousScript));
    }

}