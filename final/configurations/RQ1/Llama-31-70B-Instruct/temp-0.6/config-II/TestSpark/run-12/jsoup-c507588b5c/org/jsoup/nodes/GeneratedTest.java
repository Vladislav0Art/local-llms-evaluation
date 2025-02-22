package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void createTextNode_WhenTextIsNull_ThrowsIllegalArgumentException() {
        try {
            new TextNode(null);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
            return;
        }
        assertTrue(false);
    }

    @Test
    public void createTextNode_WhenTextIsValid_InstantiatesTextNode() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.coreValue());
    }

    @Test
    public void nodeName_ReturnsText() {
        TextNode textNode = new TextNode("test");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void text_ReturnsNormalisedText() {
        TextNode textNode = new TextNode("  test  ");
        assertEquals("test", textNode.text());
    }

    @Test
    public void text_WhenTextIsNull_ThrowsIllegalArgumentException() {
        TextNode textNode = new TextNode("test");
        try {
            textNode.text(null);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
            return;
        }
        assertTrue(false);
    }

    @Test
    public void text_SetsText() {
        TextNode textNode = new TextNode("test");
        textNode.text("new text");
        assertEquals("new text", textNode.coreValue());
    }

}