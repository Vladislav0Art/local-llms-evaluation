package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestJsoupIdSelect {

    @Test
    public void testJsoupIdSelect() {
        String html = "<html><body id=\"test\"><p>Hello World!</p></body></html>";
        Document document = Jsoup.parse(html);

        Element element = (Element) document.select("#test").first();
        assertEquals("test", element.attr("id"));
    }

}