package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    private TextNode textNode;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        textNode = new TextNode("");
    }

    @Test
    public void shouldCreateTextNode() {
        assertNotNull(textNode);
    }

    @Test
    public void shouldReturnNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void shouldReturnTextContent() {
        textNode.text("some text");
        assertEquals("some text", textNode.text());
    }

    @Test
    public void shouldGetWholeText() {
        textNode.text("some text");
        assertEquals("some text", textNode.getWholeText());
    }

    @Test
    public void shouldReturnTrueForBlankTextNode() {
        assertTrue(textNode.isBlank());
    }

    @Test
    public void shouldReturnFalseForNonBlankTextNode() {
        textNode.text("some text");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void shouldSplitTextNode() {
        textNode.text("some text");
        TextNode tailNode = textNode.splitText(4);
        assertEquals("some", textNode.getWholeText());
        assertEquals("text", tailNode.getWholeText());
    }

}