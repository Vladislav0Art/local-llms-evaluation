package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        Document document = Jsoup.parse("<html><body><tail>...</tail></body></html>");
        OuterHtmlTail tail = new OuterHtmlTail(document);
        assertEquals("tail content", tail.getContent());
    }
}

}