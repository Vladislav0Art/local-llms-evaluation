package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedConstructorWithNullArgumentTest {

    @Test
    public void constructorWithNullArgumentTest() {
        TextNode textNode = new TextNode(null);
        assertNotNull(textNode);
        assertEquals("", textNode.text());
    }

}