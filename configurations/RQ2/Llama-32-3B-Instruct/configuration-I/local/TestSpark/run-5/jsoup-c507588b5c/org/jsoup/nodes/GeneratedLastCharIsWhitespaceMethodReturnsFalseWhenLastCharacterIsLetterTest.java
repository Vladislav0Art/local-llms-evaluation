package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedLastCharIsWhitespaceMethodReturnsFalseWhenLastCharacterIsLetterTest {

    @Test
    public void lastCharIsWhitespaceMethodReturnsFalseWhenLastCharacterIsLetterTest() {
        StringBuilder sb = new StringBuilder("Hello");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}