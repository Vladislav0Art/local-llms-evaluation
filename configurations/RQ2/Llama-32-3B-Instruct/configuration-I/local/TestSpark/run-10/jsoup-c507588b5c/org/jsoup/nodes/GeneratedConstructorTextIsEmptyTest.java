package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedConstructorTextIsEmptyTest {

    @Test
    public void constructorTextIsEmptyTest() {
        TextNode node = new TextNode("");
        assertNotNull(node.text());
        assertEquals("", node.getWholeText());
        assertTrue(node.isBlank());
    }

}