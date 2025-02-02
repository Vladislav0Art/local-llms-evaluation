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

public class GeneratedOuterHtmlHead_GivenTextNode_ReturnsCorrectString {

    @Test
    public void outerHtmlHead_GivenTextNode_ReturnsCorrectString() {
        TextNode textNode = new TextNode("Hello World");
        Document document = Mockito.mock(Document.class);
        textNode.parentNode = document;
        byte[] accum = new byte[1024];
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint = true;
        try {
            textNode.outerHtmlHead(new Appendable() {
            }, depth, out);
            fail("Expected Exception");
        } catch (IOException e) {
            // Expected
        }
    }

}