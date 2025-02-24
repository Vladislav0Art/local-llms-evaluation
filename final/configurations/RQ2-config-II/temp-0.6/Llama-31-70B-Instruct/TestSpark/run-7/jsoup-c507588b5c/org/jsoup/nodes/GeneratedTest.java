package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private TextNode textNode;

    @Test
    public void testNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        assertEquals("", textNode.text());
    }

    @Test
    public void testTextWithText() {
        textNode.text("Text");
        assertEquals("Text", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        assertEquals("", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        assertEquals(true, textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("Text");
        assertEquals(new TextNode(""), textNode.splitText(0));
    }

    @Test
    public void testToString() {
        assertEquals("TextNode[\"\"]", textNode.toString());
    }

    @Test
    public void testClone() {
        TextNode textNode = new TextNode("Text");
        assertEquals(textNode, textNode.clone());
    }

    @Test
    public void testCreateFromEncoded() {
        assertEquals(new TextNode("Text"), TextNode.createFromEncoded("Text"));
    }

    @Test
    public void testNormaliseWhitespace() {
        assertEquals("Text", TextNode.normaliseWhitespace("Text"));
    }

}