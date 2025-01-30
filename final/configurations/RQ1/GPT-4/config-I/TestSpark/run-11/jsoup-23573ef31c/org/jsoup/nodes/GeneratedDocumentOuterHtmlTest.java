package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedDocumentOuterHtmlTest {

    @Test
    public void DocumentOuterHtmlTest() {
        String baseUri = "http://www.google.com";
        Document doc = Document.createShell(baseUri);
        doc.head().appendChild(new TextNode("Test"));

        String expectedHtml = "<html>\n <head>\n  Test\n </head>\n <body></body>\n</html>\n";
        Assert.assertEquals(doc.outerHtml(), expectedHtml);
    }

}