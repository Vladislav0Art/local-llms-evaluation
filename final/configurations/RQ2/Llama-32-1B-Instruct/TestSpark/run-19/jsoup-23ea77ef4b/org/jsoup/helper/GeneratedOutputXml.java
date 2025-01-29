package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeList;

public class GeneratedOutputXml {

    @Test
    public void outputXml() {
        Document doc = new Document();
        String result = W3CDom.outputXml(doc);
        Assert.assertEquals("null", result);
    }

}