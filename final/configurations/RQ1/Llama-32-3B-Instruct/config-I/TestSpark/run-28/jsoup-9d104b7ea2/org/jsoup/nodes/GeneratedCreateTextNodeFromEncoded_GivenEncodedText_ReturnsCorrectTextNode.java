package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayBuilder;
import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedCreateTextNodeFromEncoded_GivenEncodedText_ReturnsCorrectTextNode {

    @Test
    public void createTextNodeFromEncoded_GivenEncodedText_ReturnsCorrectTextNode() {
        String encodedText = "&lt;Hello&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
        assertEquals("Hello", textNode.value());
    }

}