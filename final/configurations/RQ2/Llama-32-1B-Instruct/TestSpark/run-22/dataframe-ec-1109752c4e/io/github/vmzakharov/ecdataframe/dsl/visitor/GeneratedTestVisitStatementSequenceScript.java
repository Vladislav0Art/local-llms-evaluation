package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestVisitStatementSequenceScript {

    @Test
    public void testVisitStatementSequenceScript() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression statementSequenceScript = new StatementSequenceScript(new VarExpr("x"), new ConstExpr(Value.create(5)));
        visitor.visitStatementSequenceScript(statementSequenceScript);
        assertMocked(visitor.printer, Value.create("x"));
    }

}