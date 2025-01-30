package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.util.HashMap;
import java.util.Map;

public class GeneratedFromJsoupReturnDocumentTest {

    private static final String INPUT_HTML = "<html><head><title>Title</title></head><body>Body</body></html>";

    @Test
    public void fromJsoupReturnDocumentTest() {
        Document document = Jsoup.parse(INPUT_HTML);
        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document w3cDocument = w3CDom.fromJsoup(document);
        Assert.assertNotNull(w3cDocument);
        Assert.assertEquals("html", w3cDocument.getDocumentElement().getNodeName());
    }

}