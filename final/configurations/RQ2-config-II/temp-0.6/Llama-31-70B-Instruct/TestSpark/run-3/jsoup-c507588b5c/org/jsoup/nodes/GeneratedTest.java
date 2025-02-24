package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    private TextNode textNode;

    @Before
    public void setup() {
        textNode = new TextNode("test");
    }

    @Test
    public void textNodeConstructorTest() {
        assertNotNull(textNode);
    }

    @Test
    public void textNodeNodeNameTest() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textNodeTextTest() {
        assertEquals("test", textNode.text());
    }

    @Test
    public void textNodeTextSetterTest() {
        TextNode textNode = new TextNode("test");
        textNode.text("test2");
        assertEquals("test2", textNode.text());
    }

    @Test
    public void textNodeGetWholeTextTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void textNodeIsBlankTest() {
        TextNode textNode = new TextNode(" ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void textNodeSplitTextTest() {
        TextNode textNode = new TextNode("test");
        TextNode splitNode = textNode.splitText(2);
        assertEquals("st", splitNode.text());
    }

}