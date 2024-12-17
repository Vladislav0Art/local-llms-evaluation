package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedLastCharIsWhitespace_NoWhitespace_ReturnsFalse {

    @Test
    public void lastCharIsWhitespace_NoWhitespace_ReturnsFalse() {
        StringBuilder sb = new StringBuilder("Hello");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}