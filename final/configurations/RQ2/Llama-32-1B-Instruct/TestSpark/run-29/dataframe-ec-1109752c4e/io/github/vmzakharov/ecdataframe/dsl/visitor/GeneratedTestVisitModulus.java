package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestVisitModulus {

    @Test
    public void testVisitModulus() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Expression expr = StringIterate.of("x").map(String::length).reduce((left, right) -> left + " -> " + right);
        VisitorState state = visitor.visit(expr);
        assertEquals(1, state.getVariableCount());
    }

}