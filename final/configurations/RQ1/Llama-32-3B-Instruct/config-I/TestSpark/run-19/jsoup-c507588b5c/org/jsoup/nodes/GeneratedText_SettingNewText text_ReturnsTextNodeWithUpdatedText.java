package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedText_SettingNewText text_ReturnsTextNodeWithUpdatedText {

    public String newTextNode(String text) {
        return "Text Node Created with: " + text;
    }

    @Test
    public void text_SettingNewText

    text_ReturnsTextNodeWithUpdatedText() throws IOException {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        textNode = textNode.text("New Text");
        assertEquals("New Text", textNode.text());
    }

}