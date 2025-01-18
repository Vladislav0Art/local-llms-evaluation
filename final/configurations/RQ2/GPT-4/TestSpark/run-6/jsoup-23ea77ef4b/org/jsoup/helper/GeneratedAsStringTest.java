package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.Assert;
import org.w3c.dom.NodeList;

import java.util.HashMap;

public class GeneratedAsStringTest {

    @Test
    public void asStringTest() {
        Document jsoupDocument = new Document("");
        org.w3c.dom.Document w3cDoc = W3CDom.convert(jsoupDocument);
        String str = W3CDom.asString(w3cDoc, W3CDom.OutputHtml());
        Assert.assertNotNull(str);
    }

}