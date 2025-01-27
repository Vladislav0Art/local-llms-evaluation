package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedNodeToStringTest {

    @Test
    public void nodeToStringTest() throws IOException {
        Document document = Jsoup.parse("<html><body><p>test</p></body></html>");
        assertEquals("<text>test</text>", ((Element) document.body().get(0)).toString());
    }

}