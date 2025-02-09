package org.jsoup.safety;

public class GeneratedTestAttributes {

    @Test
    public void testAttributes() {
        org.jsoup.nodes.Document document = org.jsoup.Jsoup.connect("http://example.com").get();
        org.jsoup.select.Elements elements = document.select("");
        assertEquals("", elements.toString(), "");
    }

}