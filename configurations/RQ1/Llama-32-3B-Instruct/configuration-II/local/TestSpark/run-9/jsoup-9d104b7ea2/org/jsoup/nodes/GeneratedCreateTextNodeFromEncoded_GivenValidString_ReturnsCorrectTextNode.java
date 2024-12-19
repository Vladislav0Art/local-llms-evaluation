package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCreateTextNodeFromEncoded_GivenValidString_ReturnsCorrectTextNode {

    @Test
    public void createTextNodeFromEncoded_GivenValidString_ReturnsCorrectTextNode() {
        String encodedText = "&lt;Hello&gt;, &amp;World!";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
    }

}