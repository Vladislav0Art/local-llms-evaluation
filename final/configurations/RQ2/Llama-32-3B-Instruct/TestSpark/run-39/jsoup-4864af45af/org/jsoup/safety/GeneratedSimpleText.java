package org.jsoup.safety;

public class GeneratedSimpleText {

    @Test
    public void simpleText() {
        org.jsoup.nodes.Document document = org.jsoup.Jsoup.connect("http://example.com").get();
        org.jsoup.select.Elements elements = document.select("");
        assertEquals("", elements.toString(), "");
    }

    public static class TestSimpleText {
        public String simpleText() {
            return "";
        }
    }
}

}