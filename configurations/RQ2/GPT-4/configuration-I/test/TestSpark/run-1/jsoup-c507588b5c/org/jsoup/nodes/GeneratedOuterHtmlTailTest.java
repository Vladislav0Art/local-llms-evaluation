package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode node = new TextNode("Hello");
        StringWriter writer = new StringWriter();
        node.outerHtmlTail(writer, 0, new Document.OutputSettings());
        Assert.assertEquals("", writer.toString());
    }

}