package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class GeneratedConvertTest {

    @Test
    public void convertTest() {
        Document doc = Jsoup.parse("<body><p>Test</p></body>");
        org.w3c.dom.Document result = W3CDom.convert(doc);
        Assert.assertEquals("html", result.getDocumentElement().getNodeName());
    }

}