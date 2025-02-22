package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void whenCreated_valueIsSet_TextNode() {
        String value = "test";
        TextNode textNode = new TextNode(value);
        assertEquals(value, textNode.coreValue());
    }

    @Test
    public void whenCreated_hasCorrectNodeName_TextNode() {
        TextNode textNode = new TextNode("test");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void whenCreated_hasCorrectText_TextNode() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

    @Test
    public void whenTextSet_isUpdated_TextNode() {
        TextNode textNode = new TextNode("test");
        textNode.text("test2");
        assertEquals("test2", textNode.text());
    }

    @Test
    public void whenCreated_hasCorrectWholeText_TextNode() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void whenCreated_isNotBlank_TextNode() {
        TextNode textNode = new TextNode("test");
        assertFalse(textNode.isBlank());
    }

}