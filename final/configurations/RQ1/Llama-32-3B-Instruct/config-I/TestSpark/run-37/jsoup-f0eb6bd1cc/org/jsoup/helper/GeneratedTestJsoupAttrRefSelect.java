package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestJsoupAttrRefSelect {

    @Test
    public void testJsoupAttrRefSelect() {
        String html = "<html><body><p data-ref=\"fragment\"></p></body></html>";
        Document document = Jsoup.parse(html);

        Element element = (Element) document.select("[data-ref='fragment']").first();
        assertEquals("fragment", element.attr("data-ref"));
    }

}