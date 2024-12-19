package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedClone_GivenTextNode_ReturnsCorrectClone {

    @Test
    public void clone_GivenTextNode_ReturnsCorrectClone() throws IOException {
        String text = "Hello, World!";
        int offset = 7;
        TextNode textNode = new TextNode(text);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        Document.OutputSettings settings = new Document.OutputSettings();
        TextNode cloned = textNode.clone().outerHtmlHead(null, 0, settings);
        assertEquals("Hello, World!", cloned.text());
    }

}