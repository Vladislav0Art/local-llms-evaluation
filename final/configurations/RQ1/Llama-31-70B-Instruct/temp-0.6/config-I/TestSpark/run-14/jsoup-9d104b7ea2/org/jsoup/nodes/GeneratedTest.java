package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedTest {

    private static final String ENCODED_TEXT = "&lt;";
    private static final String DECODED_TEXT = "<";

    private static final String TEXT = "text";

    @Test
    public void createFromEncodedTextTest() {
        TextNode textNode = TextNode.createFromEncoded(ENCODED_TEXT);
        assertEquals(DECODED_TEXT, textNode.coreValue());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("text");
        textNode.text("text2");
        assertEquals("text2", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode("text");
        assertEquals(false, textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("text");
        TextNode textNode2 = textNode.splitText(2);
        assertEquals("tx", textNode.getWholeText());
        assertEquals("t", textNode2.getWholeText());
    }

}