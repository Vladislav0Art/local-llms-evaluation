package org.jsoup.safety;

public class GeneratedAttributes {

    @Test
    public void attributes() {
        org.jsoup.nodes.Document document = org.jsoup.Jsoup.connect("http://example.com").get();
        org.jsoup.select.Elements elements = document.select("");
        assertEquals("", elements.toString(), "");
    }

    public static class TestAttributes {
        public String attributes() {
            return "";
        }
    }
}

}