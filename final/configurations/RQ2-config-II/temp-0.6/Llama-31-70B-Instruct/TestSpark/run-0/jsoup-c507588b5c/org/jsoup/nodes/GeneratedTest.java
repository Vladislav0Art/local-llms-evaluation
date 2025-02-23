package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.Tag;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private TextNode textNode;

    @Mock
    private Element parentElement;

    @Mock
    private Node nextNode;

    @Before
    public void setup() {
        textNode = new TextNode("text");
    }

    @Test
    public void createsTextNodeFromEncodedText() {
        TextNode textNode = TextNode.createFromEncoded("&amp;lt;");

        assertEquals("&lt;", textNode.coreValue());
    }

    @Test
    public void textNodeHasText() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textNodeHasNormalizedText() {
        assertEquals("text", textNode.text());
    }

    @Test
    public void textNodeHasWholeText() {
        assertEquals("text", textNode.getWholeText());
    }

    @Test
    public void textNodeIsNotBlank() {
        assertFalse(textNode.isBlank());
    }

    @Test
    public void textNodeIsBlank() {
        TextNode blankTextNode = new TextNode("");

        assertTrue(blankTextNode.isBlank());
    }

}