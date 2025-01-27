package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.mockito.Mockito;
import org.jsoup.internal.StringUtil;

public class GeneratedSplitTextUpdatesTextNodeWithRemovedText {

    @Test
    public void splitTextUpdatesTextNodeWithRemovedText() {
        TextNode node = new TextNode("HelloWorld");
        node.text("World");
        String result = node.splitText(5).text();
        assertEquals("Hello", result);
    }

}

public class TextNode {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public String text() {
        return text;
    }

    public void text(String text) {
        this.text = text;
    }

    public String getWholeText() {
        return text;
    }

    public boolean isBlank() {
        return text.isEmpty();
    }

    public TextNode splitText(int index) {
        // implement splitting logic here
        return new TextNode(text.substring(0, index));
    }

}

public class StringUtil {

    public static String normaliseWhitespace(String input) {
        // implement normalizing whitespace logic here
        return input.replace(" ", "");
    }

    public static boolean lastCharIsWhitespace(StringBuilder builder) {
        if (builder.length() == 0) {
            return true;
        }
        char lastChar = builder.charAt(builder.length() - 1);
        return Character.isWhitespace(lastChar);
    }

}