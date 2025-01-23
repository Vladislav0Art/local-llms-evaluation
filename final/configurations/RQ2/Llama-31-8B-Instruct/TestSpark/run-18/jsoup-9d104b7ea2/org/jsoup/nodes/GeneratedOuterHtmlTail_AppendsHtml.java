package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.StringWriter;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlTail_AppendsHtml {

    @Test
    public void outerHtmlTail_AppendsHtml() throws IOException {
        StringWriter writer = new StringWriter();
        TextNode textNode = new TextNode("text");
        textNode.outerHtmlTail(writer, 0, new Document.OutputSettings());
        assertEquals("</text>", writer.toString());
    }

}