package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestGetHead {

    private static final String HTML = "<html><head></head><body></body></html>";

    public static String generateHead() {
        return "<html><head>" + HTML + "</head>";
    }

    public static String generateBody(String content) {
        return "<html><body>" + content + "</body></html>";
    }

    @Test
    public void testGetHead() {
        Document doc = Jsoup.parse("<html><head>Hello World!</head></html>");
        System.out.println(doc.body().text());
        assertEquals(HTML, doc.body().text());
    }

}