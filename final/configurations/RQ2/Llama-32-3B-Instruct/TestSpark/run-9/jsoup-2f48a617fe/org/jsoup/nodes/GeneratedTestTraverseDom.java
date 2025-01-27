package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTestTraverseDom {

    @Test
    public void testTraverseDom() throws Exception {
        String html = "<html><body><p>Paragraph 1</p><p>Paragraph 2</p></body></html>";
        Document document = Jsoup.parse(html);

        Element paragraph1 = document.select("p").first();
        System.out.println(paragraph1.text());

        Element pElement = document.select("p").first().select("a").first();
        if (pElement != null) {
            System.out.println(pElement.attr("href"));
        }
    }

}