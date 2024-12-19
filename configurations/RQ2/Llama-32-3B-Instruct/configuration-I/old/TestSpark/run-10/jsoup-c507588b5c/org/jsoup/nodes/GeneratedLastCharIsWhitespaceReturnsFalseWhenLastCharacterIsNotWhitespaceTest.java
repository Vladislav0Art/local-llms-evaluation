package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedLastCharIsWhitespaceReturnsFalseWhenLastCharacterIsNotWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceReturnsFalseWhenLastCharacterIsNotWhitespaceTest() {
        String text = "ab";
        assertFalse(TextNode.lastCharIsWhitespace(text));
    }

}