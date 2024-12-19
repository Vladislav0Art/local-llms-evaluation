package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedConstructorTextIsNotBlankTest {

    @Test
    public void constructorTextIsNotBlankTest() {
        TextNode node = new TextNode("test");
        assertNotNull(node.text());
        assertEquals("test", node.getWholeText());
        assertFalse(node.isBlank());
    }

}