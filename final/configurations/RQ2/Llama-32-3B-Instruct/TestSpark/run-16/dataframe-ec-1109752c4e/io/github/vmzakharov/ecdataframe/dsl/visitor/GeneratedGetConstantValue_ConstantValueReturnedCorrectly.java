package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetConstantValue_ConstantValueReturnedCorrectly {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();

    @Test
    public void getConstantValue_ConstantValueReturnedCorrectly() {
        assertEquals(2, expression.getConstantValue());
    }

}