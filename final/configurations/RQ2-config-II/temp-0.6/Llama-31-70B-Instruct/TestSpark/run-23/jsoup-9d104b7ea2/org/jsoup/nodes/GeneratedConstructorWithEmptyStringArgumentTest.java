package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedConstructorWithEmptyStringArgumentTest {

    @Test
    public void constructorWithEmptyStringArgumentTest() {
        TextNode textNode = new TextNode("");
        assertNotNull(textNode);
        assertEquals("", textNode.text());
    }

}