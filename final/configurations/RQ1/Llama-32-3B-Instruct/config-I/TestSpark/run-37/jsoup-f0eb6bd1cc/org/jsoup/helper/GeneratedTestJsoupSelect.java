package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestJsoupSelect {

    @Test
    public void testJsoupSelect() {
        String html = "<html><body><p>Hello World!</p></body></html>";
        Document document = Jsoup.parse(html);

        Elements elements = document.select("body");
        assertEquals(1, elements.size());

        Element bodyElement = (Element) elements.get(0);
        assertEquals("", bodyElement.attr("class"));
    }

}