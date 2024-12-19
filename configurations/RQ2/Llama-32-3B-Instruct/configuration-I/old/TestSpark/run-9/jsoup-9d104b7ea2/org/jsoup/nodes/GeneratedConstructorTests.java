package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedConstructorTests {

    @Test
    public void constructorTests() {
        String text = "Hello World";
        assertTrue(new TextNode(text).text().equals(text));
    }

}