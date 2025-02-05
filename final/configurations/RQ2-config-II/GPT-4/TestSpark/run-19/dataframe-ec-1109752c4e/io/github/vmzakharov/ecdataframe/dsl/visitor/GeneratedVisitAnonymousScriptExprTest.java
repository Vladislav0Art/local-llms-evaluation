package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVisitAnonymousScriptExprTest {

    @Test
    public void visitAnonymousScriptExprTest() {
        AnonymousScript anonymousScript = Mockito.mock(AnonymousScript.class);
        Mockito.doCallRealMethod().when(anonymousScript).accept(Mockito.any());

        anonymousScript.accept(new PrettyPrintVisitor());
        Mockito.verify(anonymousScript, Mockito.times(1)).accept(Mockito.any());
    }

}