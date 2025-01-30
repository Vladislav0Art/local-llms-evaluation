package org.jsoup.helper;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.Map;
import java.util.HashMap;

public class GeneratedConvertTest {

    @Test
    public void convertTest() {
        Document jsoupDoc = Jsoup.parse("<html></html>");
        org.w3c.dom.Document w3cDoc = W3CDom.convert(jsoupDoc);

        Assert.assertEquals(jsoupDoc.tagName(), w3cDoc.getDocumentElement().getTagName());
    }

}