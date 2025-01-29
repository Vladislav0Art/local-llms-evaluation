package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestPublicVariable {

    @Test
    public void testPublicVariable() {
        publicClass publicVar = new publicClass();
        assertEquals(null, publicVar.publicVar);
        publicVar.publicVar = "some value";
        assertEquals("some value", publicVar.publicVar);
    }
}

class PublicClass {
    public String publicMethod() {
        return null;
    }

    public void publicVariable(String var) {
        this.publicVar = var;
    }

}