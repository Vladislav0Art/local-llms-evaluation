package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestVisitFunctionScriptExpr_FunctionDeclaration {

    @Test
    public void testVisitFunctionScriptExpr_FunctionDeclaration() {
        FunctionScript expr = new FunctionScript("func", Mockito.mock(Value.class));
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitFunctionScriptExpr(expr);
    }

}