package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestVisitAnonymousScriptExpr_AnonymousFunction {

    @Test
    public void testVisitAnonymousScriptExpr_AnonymousFunction() {
        AnonymousScript expr = new AnonymousScript();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitAnonymousScriptExpr(expr);
    }

}