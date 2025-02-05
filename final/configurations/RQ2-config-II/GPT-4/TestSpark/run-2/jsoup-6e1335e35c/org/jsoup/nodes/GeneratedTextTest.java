package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.junit.Test;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        Element element = new Element("div");
        element.text("Hello World");
        assertEquals("Hello World", element.text());
    }

}