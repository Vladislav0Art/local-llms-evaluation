package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import io.github.vmzakharov.ecdataframe.dsl.Value;
import io.github.vmzakharov.ecdataframe.dsl.Expression;
import io.github.vmzakharov.ecdataframe.dsl.function.FunctionScript;

public class GeneratedVisitAliasExprTest {

    @Test
    public void visitAliasExprTest() {
        AliasExpr aliasExpression = mock(AliasExpr.class);
        when(aliasExpression.getAlias()).thenReturn("aliasName");
        when(aliasExpression.getExpression()).thenReturn(Value.asStringLiteral("MockExpr"));

        PrettyPrintVisitor printer = new PrettyPrintVisitor();
        printer.visitAliasExpr(aliasExpression);

        String result = printer.printer.toString();
        assertEquals("aliasName : MockExpr", result);
    }

}