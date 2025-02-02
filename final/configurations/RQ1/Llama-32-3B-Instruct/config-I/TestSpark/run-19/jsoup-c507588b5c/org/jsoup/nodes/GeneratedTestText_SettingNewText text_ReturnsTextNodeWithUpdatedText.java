package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedTestText_SettingNewText text_ReturnsTextNodeWithUpdatedText {

    public static String text_ReturnsTextNodeWithUpdatedText(String text) throws IOException {
        TextNode textNode = new TextNode(text);
        textNode = textNode.text("New Text");
        return textNode.text();
    }

    @Test
    public void testText_SettingNewText

    text_ReturnsTextNodeWithUpdatedText() throws IOException {
        String text = "Hello World";
        String result = text_ReturnsTextNodeWithUpdatedText(text);
        assertEquals("New Text", result);
    }

}