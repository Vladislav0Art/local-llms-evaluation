package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestGetBody {

    private static final String HTML = "<html><head></head><body></body></html>";

    public static String generateHead() {
        return "<html><head>" + HTML + "</head>";
    }

    public static String generateBody(String content) {
        return "<html><body>" + content + "</body></html>";
    }

    @Test
    public void testGetBody() {
        Document doc = Jsoup.parse("<html><body>Hello World!</body></html>");
        System.out.println(doc.body().text());
        assertEquals(content, doc.body().text());
    }

}