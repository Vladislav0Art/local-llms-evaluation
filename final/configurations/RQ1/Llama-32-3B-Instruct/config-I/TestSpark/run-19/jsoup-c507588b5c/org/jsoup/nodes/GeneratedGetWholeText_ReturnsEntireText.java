package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedGetWholeText_ReturnsEntireText {

    public static String text_ReturnsTextNodeWithUpdatedText(String text) throws IOException {
        TextNode textNode = new TextNode(text);
        textNode = textNode.text("New Text");
        return textNode.text();
    }

    @Test
    public void getWholeText_ReturnsEntireText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

}