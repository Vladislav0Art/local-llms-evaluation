package org.jsoup.helper;

public class GeneratedTestConnection {

    @Test
    public void testConnection() {
        Document document = Jsoup.connect("https://www.google.com").get();
        System.out.println(document.title());
    }

}