package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import org.jsoup.helper.Validate;

public class GeneratedOuterHtmlTail {

    @Test
    public void outerHtmlTail() {
        TextNode textNode = new TextNode("<p>Hello, World!</p>");
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings settings = null; // not used
        textNode.outerHtmlTail(accum, depth, settings);
        assertEquals("</p>", accum.toString());
    }

}