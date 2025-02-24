package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedConstructorWithNonEmptyStringArgumentTest {

    @Test
    public void constructorWithNonEmptyStringArgumentTest() {
        TextNode textNode = new TextNode("test");
        assertNotNull(textNode);
        assertEquals("test", textNode.text());
    }

}