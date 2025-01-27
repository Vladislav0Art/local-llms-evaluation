package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetVariableName_VariableNameReturnedCorrectly {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();

    @Test
    public void getVariableName_VariableNameReturnedCorrectly() {
        assertEquals("x", expression.getVariableName());
    }

}