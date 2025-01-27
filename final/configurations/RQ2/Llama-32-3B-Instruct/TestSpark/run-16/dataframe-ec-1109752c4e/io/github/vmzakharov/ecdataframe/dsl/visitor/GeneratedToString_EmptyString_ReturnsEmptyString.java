package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedToString_EmptyString_ReturnsEmptyString {

    private PrettyPrintVisitor visitor = new PrettyPrintVisitor();

    @Test
    public void toString_EmptyString_ReturnsEmptyString() {
        printer.clear();
        assertEquals("", printer.toString());
    }
}

}