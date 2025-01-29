package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestVisitBinaryExpression {

    @Test
    public void testVisitBinaryExpression() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = StringIterate.of("x").map(String::length).reduce((left, right) -> left + " -> " + right);
        VisitorState state = visitor.visit(expr);
        assertEquals(2, state.getVariableCount());
    }

}