package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestJsoupConstructor {

    @Test
    public void testJsoupConstructor() {
        String html = "<html><body>Hello World!</body></html>";
        Document domDoc = Jsoup.parse(html);
        System.out.println(domDoc.html());
    }

}