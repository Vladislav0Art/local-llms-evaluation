package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;

public class GeneratedLastCharIsWhitespace_WillReturnTrueForEmptyStringBuilder {

    @Test
    public void lastCharIsWhitespace_WillReturnTrueForEmptyStringBuilder() {
        StringBuilder sb = new StringBuilder();
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}