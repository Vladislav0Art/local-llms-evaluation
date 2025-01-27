package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTextNodeIsBlankTest {

    @Test
    public void textNodeIsBlankTest() throws IOException {
        Document document = Jsoup.parse("<html><body></body></html>");
        assertTrue(document.body().blank());
        assertFalse(new Element("").isBlank());
    }

}