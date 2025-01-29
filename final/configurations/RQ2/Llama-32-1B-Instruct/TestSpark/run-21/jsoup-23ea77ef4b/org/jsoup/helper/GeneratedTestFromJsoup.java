package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.jupiter.api.Test;

public class GeneratedTestFromJsoup {

    @Test
    public void testFromJsoup() {
        W3CDom doc1 = new W3CDom();
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.parse("html");
        Document document2 = new W3CDom().fromJsoup(document1);

        org.jsoup.nodes.Element element1 = document1.select("body").first();
        org.jsoup.nodes.Element element2 = document2.select("body").first();

        assertEquals(element1, element2);
    }

}