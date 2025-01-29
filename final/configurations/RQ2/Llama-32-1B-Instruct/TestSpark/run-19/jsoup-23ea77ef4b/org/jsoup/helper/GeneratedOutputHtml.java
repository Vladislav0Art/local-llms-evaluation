package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeList;

public class GeneratedOutputHtml {

    @Test
    public void outputHtml() {
        Document in = new Document();
        String result = W3CDom.outputHtml(in);
        Assert.assertEquals("null", result);
    }

}