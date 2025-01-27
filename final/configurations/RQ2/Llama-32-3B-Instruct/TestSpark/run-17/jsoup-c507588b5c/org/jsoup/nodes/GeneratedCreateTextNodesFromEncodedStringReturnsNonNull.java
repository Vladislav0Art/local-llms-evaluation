package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedCreateTextNodesFromEncodedStringReturnsNonNull {

    @Test
    public void createTextNodesFromEncodedStringReturnsNonNull() {
        TextNode textNode = TextNode.createFromEncoded("hello");
        assertNotNull(textNode);
    }

}