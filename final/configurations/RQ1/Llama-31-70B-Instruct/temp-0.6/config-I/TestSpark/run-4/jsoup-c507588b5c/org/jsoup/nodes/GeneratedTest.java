package org.jsoup.nodes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GeneratedTest {

    private TextNode textNode;

    @BeforeEach
    void setUp() {
        textNode = new TextNode("some text");
    }

    @AfterEach
    void tearDown() {
        textNode = null;
    }

    @Test
    public void testNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        assertEquals("some text", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        assertEquals("some text", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        assertEquals(false, textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode newTextNode = textNode.splitText(1);
        assertEquals("o", newTextNode.getWholeText());
        assertEquals("s", textNode.getWholeText());
    }

    @Test
    public void testOuterHtmlHead() {
        Appendable appendable = Mockito.mock(Appendable.class);
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        outputSettings.prettyPrint(true);
        textNode.outerHtmlHead(appendable, 0, outputSettings);
        Mockito.verify(appendable).append("some text");
    }

}