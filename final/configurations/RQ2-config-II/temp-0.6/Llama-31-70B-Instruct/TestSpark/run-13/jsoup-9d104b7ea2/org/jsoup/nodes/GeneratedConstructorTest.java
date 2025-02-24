package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        TextNode textNode = new TextNode("Test");
        assertEquals("Test", textNode.text());
    }

}