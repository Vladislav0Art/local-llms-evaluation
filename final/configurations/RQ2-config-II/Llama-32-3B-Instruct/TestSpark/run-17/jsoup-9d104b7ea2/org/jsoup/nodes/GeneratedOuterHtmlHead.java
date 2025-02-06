package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.dom.Appendable;
import org.jsoup.parser.Document;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document.OutputSettings;

public class GeneratedOuterHtmlHead {

    @Test
    public void outerHtmlHead() throws IOException {
        Appendable accum = mock(Appendable.class);
        Document document = new Document();
        document.setDocumentParser(new Parser(document));
        TextNode node = new TextNode("example");
        String expectedHTML = "<text>Hello, World!</text>";
        node.outerHtmlHead(accum, 0, document.getOutputSettings());
        assertEquals(expectedHTML, accum.toString());
    }

}