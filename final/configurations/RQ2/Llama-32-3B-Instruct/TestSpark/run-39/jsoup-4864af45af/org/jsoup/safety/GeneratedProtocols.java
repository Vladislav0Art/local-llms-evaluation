package org.jsoup.safety;

public class GeneratedProtocols {

    @Test
    public void protocols() {
        org.jsoup.nodes.Document document = org.jsoup.Jsoup.connect("http://example.com").get();
        org.jsoup.select.Elements elements = document.select("");
        assertEquals("", elements.toString(), "");
    }

    public static class TestProtocols {
        public String protocols() {
            return "";
        }
    }

}