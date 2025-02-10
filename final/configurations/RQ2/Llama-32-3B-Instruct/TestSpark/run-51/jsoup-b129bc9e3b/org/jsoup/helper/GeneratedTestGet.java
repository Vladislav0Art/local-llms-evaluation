package org.jsoup.helper;

public class GeneratedTestGet {

    @Test
    public void testGet() {
        String url = "http://example.com";
        Document document = Jsoup.connect(url).get();
        System.out.println(document.html());
    }

}