package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedCreateFromEncodedCreatesCorrectTextNode {

    @Test
    public void createFromEncodedCreatesCorrectTextNode() throws IOException {
        TextNode textNode = TextNode.createFromEncoded("<p>Hello World</p>");
        assertEquals("Hello World", textNode.getWholeText());
    }

}