package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestParse {

    @Test
    public void testParse() {
        Document document = new XmlTreeBuilder().parse(new StringReader("<root><a>b</a></root>"));
        Document expectedDocument = new XmlTreeBuilder().parse("http://example.com/root.html", "http://example.com");
        Assert.assertSame(document, expectedDocument);
    }

}