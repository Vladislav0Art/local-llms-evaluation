package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestJsoupDomConverter {

    @Test
    public void testJsoupDomConverter() {
        String html = "<html><body>Hello World!</body></html>";
        Document domDoc = new org.jsoup.Jsoup().parse(html);
        Element element = (Element) domDoc.contextNode();
        System.out.println(element.html());
    }

}