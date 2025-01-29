package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.jupiter.api.Test;

public class GeneratedTestContextNode {

    @Test
    public void testContextNode() {
        W3CDom doc = new W3CDom();
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document();

        Document doc2 = new org.jsoup.nodes.Document(document1);
        org.jsoup.nodes.Element element = doc2.select("body").first();

        assertTrue(doc.contextNode(document2).equals(element));
    }

}