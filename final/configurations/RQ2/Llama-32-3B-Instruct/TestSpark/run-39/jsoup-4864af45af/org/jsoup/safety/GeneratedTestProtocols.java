package org.jsoup.safety;

public class GeneratedTestProtocols {

    @Test
    public void testProtocols() {
        org.jsoup.nodes.Document document = org.jsoup.Jsoup.connect("http://example.com").get();
        org.jsoup.select.Elements elements = document.select("");
        assertEquals("", elements.toString(), "");
    }

}