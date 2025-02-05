package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedPrettyPrintVisitorDefaultConstructorTest {

    @Test
    public void PrettyPrintVisitorDefaultConstructorTest() {
        PrettyPrintVisitor ppvisitor = new PrettyPrintVisitor();
        assertNotEquals(ppvisitor, null);
    }

}