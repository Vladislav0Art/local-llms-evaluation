package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedIsBlank_ReturnsTrueWhenTextIsEmptyOrWhitespaceOnly {

    public static String text_ReturnsTextNodeWithUpdatedText(String text) throws IOException {
        TextNode textNode = new TextNode(text);
        textNode = textNode.text("New Text");
        return textNode.text();
    }

    @Test
    public void isBlank_ReturnsTrueWhenTextIsEmptyOrWhitespaceOnly() {
        TextNode textNode1 = new TextNode("   ");
        assertTrue(textNode1.isBlank());

        TextNode textNode2 = new TextNode("");
        assertTrue(textNode2.isBlank());
    }

}