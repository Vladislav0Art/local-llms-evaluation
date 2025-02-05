package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedVisitStatementSequenceScriptTest {

    @Test
    public void visitStatementSequenceScriptTest() {
        StatementSequenceScript expr = new StatementSequenceScript();
        expr.addStatement(new AssingExpr("a", new DecimalExpr(10)));
        assertEquals("{...}", PrettyPrintVisitor.exprToString(expr));
    }

}