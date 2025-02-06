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

public class GeneratedOuterHtmlHead {

    @Test
    public void outerHtmlHead() throws IOException {
        TextNode textNode = new TextNode("<p>Hello, World!</p>");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int depth = 0;
        Document.OutputSettings settings = null; // not used
        textNode.outerHtmlHead(accum, depth, settings);
        assertEquals("<p>", outContent.toString());
    }

}