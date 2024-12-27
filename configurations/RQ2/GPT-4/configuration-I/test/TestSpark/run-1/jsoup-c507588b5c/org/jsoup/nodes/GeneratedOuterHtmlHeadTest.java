package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode node = new TextNode("Hello");
        StringWriter writer = new StringWriter();
        node.outerHtmlHead(writer, 0, new Document.OutputSettings());
        Assert.assertEquals("Hello", writer.toString());
    }

}