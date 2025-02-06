package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedLastCharIsWhitespaceReturnsTrueWhenCharIsWhitespace {

    @Test
    public void lastCharIsWhitespaceReturnsTrueWhenCharIsWhitespace() {
        StringBuilder sb = new StringBuilder("   ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}