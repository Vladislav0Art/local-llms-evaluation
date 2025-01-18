package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.Assert;
import org.w3c.dom.NodeList;

import java.util.HashMap;

public class GeneratedConvertDocumentTest {

    @Test
    public void convertDocumentTest() {
        Document jsoupDocument = new Document("");
        org.w3c.dom.Document result = W3CDom.convert(jsoupDocument);
        Assert.assertNotNull(result);
    }

}