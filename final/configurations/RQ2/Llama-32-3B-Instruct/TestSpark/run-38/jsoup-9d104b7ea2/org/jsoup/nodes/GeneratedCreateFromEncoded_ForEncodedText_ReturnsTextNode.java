package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Appendable;

public class GeneratedCreateFromEncoded_ForEncodedText_ReturnsTextNode {

    @Test
    public void createFromEncoded_ForEncodedText_ReturnsTextNode() throws IOException {
        String encodedText = "Hello%20World";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals(encodedText, textNode.getText());
    }

}