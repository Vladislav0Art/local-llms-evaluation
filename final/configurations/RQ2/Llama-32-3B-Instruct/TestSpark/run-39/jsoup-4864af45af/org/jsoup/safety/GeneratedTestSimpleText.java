package org.jsoup.safety;

public class GeneratedTestSimpleText {

    @Test
    public void testSimpleText() {
        org.jsoup.nodes.Document document = org.jsoup.Jsoup.connect("http://example.com").get();
        org.jsoup.select.Elements elements = document.select("");
        assertEquals("", elements.toString(), "");
    }

}