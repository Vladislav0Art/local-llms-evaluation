package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import org.jsoup.helper.Validate;

public class GeneratedLastCharIsWhitespace {

    @Test
    public void lastCharIsWhitespace() {
        StringBuilder sb = new StringBuilder();
        assertTrue(TextNode.lastCharIsWhitespace(sb));
        sb.append(' ');
        assertTrue(TextNode.lastCharIsWhitespace(sb));
        sb.append('!');
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}