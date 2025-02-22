package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.Tag;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Collections;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("");
    }

    @Test
    public void testNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        textNode.coreValue("#text");
        assertEquals("#text", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        textNode.coreValue("Whole text");
        assertEquals("Whole text", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        textNode.coreValue("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        textNode.coreValue("Split text");
        TextNode tailNode = textNode.splitText(4);
        assertEquals("Split", textNode.coreValue());
        assertEquals(" text", tailNode.coreValue());
    }

    @Test
    public void testSplitTextWithNegativeOffset() {
        textNode.splitText(-1);
    }

    @Test
    public void testSplitTextWithGreaterOffset() {
        textNode.coreValue("Split text");
        textNode.splitText(11);
    }

}