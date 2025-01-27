package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Document document = Jsoup.parse("<html><head></head><body>test</body></html>");
        assertEquals("test", document.body().text());
    }

    @Test
    public void innerHtmlHeadTest() throws IOException {
        Document document = Jsoup.parse("<html><head>test</head><body>test</body></html>");
        assertEquals("test", document.head().text());
    }

    @Test
    public void wholeText() throws IOException {
        Document document = Jsoup.parse("<html><body>test</body></html>");
        assertEquals("test", document.body().getWholeText());
    }

    @Test
    public void textNodeIsBlankTest() throws IOException {
        Document document = Jsoup.parse("<html><body></body></html>");
        assertTrue(document.body().blank());
        assertFalse(new Element("").isBlank());
    }

    @Test
    public void nodeToStringTest() throws IOException {
        Document document = Jsoup.parse("<html><body><p>test</p></body></html>");
        assertEquals("<text>test</text>", ((Element) document.body().get(0)).toString());
    }

}