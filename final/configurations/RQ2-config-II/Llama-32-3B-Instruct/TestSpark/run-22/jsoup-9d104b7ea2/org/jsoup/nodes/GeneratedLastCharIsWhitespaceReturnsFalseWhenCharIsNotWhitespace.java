package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedLastCharIsWhitespaceReturnsFalseWhenCharIsNotWhitespace {

    @Test
    public void lastCharIsWhitespaceReturnsFalseWhenCharIsNotWhitespace() {
        assertFalse(TextNode.lastCharIsWhitespace(new StringBuilder()));
    }

}