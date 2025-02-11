package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest {

    @Test
    public void testJsoupSelect() {
        String html = "<html><body><p>Hello World!</p></body></html>";
        Document document = Jsoup.parse(html);

        Elements elements = document.select("body");
        assertEquals(1, elements.size());

        Element bodyElement = (Element) elements.get(0);
        assertEquals("", bodyElement.attr("class"));
    }

    @Test
    public void testJsoupIdSelect() {
        String html = "<html><body id=\"test\"><p>Hello World!</p></body></html>";
        Document document = Jsoup.parse(html);

        Element element = (Element) document.select("#test").first();
        assertEquals("test", element.attr("id"));
    }

    @Test
    public void testJsoupAttrSelect() {
        String html = "<html><body><p data-test=\"value\"></p></body></html>";
        Document document = Jsoup.parse(html);

        Element element = (Element) document.select("[data-test='value']").first();
        assertEquals("value", element.attr("data-test"));
    }

    @Test
    public void testJsoupAttrRefSelect() {
        String html = "<html><body><p data-ref=\"fragment\"></p></body></html>";
        Document document = Jsoup.parse(html);

        Element element = (Element) document.select("[data-ref='fragment']").first();
        assertEquals("fragment", element.attr("data-ref"));
    }

}