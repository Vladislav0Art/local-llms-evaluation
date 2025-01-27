package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestVisitStatementSequenceScript_SimpleSequence {

    @Test
    public void testVisitStatementSequenceScript_SimpleSequence() {
        StatementSequenceScript expr = new StatementSequenceScript();
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        visitor.visitStatementSequenceScript(expr);
    }

}