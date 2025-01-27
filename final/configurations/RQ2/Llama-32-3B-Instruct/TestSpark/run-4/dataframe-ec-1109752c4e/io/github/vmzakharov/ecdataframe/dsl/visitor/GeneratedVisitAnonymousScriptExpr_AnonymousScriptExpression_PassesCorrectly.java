package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedVisitAnonymousScriptExpr_AnonymousScriptExpression_PassesCorrectly {

    private PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();

    @Test
    public void visitAnonymousScriptExpr_AnonymousScriptExpression_PassesCorrectly() {
        AnonymousScript anonymousScript = new AnonymousScript("{1, 2, 3}");
        prettyPrintVisitor.visitAnonymousScriptExpr(anonymousScript);
    }

}