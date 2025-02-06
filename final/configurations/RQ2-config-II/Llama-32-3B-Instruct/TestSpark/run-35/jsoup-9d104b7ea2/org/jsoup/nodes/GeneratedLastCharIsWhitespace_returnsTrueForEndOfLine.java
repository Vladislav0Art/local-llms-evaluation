package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedLastCharIsWhitespace_returnsTrueForEndOfLine {

    @Test
    public void lastCharIsWhitespace_returnsTrueForEndOfLine() {
        assertTrue(TextNode.lastCharIsWhitespace(new StringBuilder("\n")));
    }

}