package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestJsoupAttrSelect {

    @Test
    public void testJsoupAttrSelect() {
        String html = "<html><body><p data-test=\"value\"></p></body></html>";
        Document document = Jsoup.parse(html);

        Element element = (Element) document.select("[data-test='value']").first();
        assertEquals("value", element.attr("data-test"));
    }

}