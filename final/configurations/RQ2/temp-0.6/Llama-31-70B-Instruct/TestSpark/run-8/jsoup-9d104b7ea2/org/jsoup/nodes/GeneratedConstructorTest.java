package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.nodeName());
        assertEquals("test", textNode.text());
    }

}