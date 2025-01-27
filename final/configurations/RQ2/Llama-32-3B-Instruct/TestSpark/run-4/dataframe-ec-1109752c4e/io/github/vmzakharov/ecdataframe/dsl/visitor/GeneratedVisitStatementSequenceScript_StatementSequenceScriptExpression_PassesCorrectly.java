package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

public class GeneratedVisitStatementSequenceScript_StatementSequenceScriptExpression_PassesCorrectly {

    private PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();

    @Test
    public void visitStatementSequenceScript_StatementSequenceScriptExpression_PassesCorrectly() {
        StatementSequenceScript statementSequenceScript = new StatementSequenceScript("{1, 2, 3}");
        prettyPrintVisitor.visitStatementSequenceScript(statementSequenceScript);
    }

}