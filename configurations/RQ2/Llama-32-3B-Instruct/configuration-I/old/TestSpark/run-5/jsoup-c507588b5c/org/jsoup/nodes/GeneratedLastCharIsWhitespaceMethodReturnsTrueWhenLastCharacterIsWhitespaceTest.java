package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedLastCharIsWhitespaceMethodReturnsTrueWhenLastCharacterIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceMethodReturnsTrueWhenLastCharacterIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("\n");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}