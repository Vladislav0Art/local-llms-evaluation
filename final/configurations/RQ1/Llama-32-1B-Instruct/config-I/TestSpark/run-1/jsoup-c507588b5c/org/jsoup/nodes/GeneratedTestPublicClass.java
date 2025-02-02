package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPublicClass {

    @Test
    public void testPublicClass() {
        Main main = new Main();
        assertEquals("Hello, World!", main.publicMethod1());
    }

    public int publicMethod1() {
        return 10;
    }
}

class PublicMethod {
    public String getPublicString() {
        return "Hello, World!";
    }

}