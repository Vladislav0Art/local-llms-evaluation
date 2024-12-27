package io.github.vmzakharov.ecdataframe.dsl.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedPrettyPrintVisitorConstructorTest {

    @Test
    public void PrettyPrintVisitorConstructorTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        assertEquals(PrettyPrintVisitor.class, visitor.getClass());
    }

}