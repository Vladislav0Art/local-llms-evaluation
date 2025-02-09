package org.jsoup.safety;

public class GeneratedNone {

    @Test
    public void none() {
        org.jsoup.nodes.Document document = org.jsoup.Jsoup.connect("http://example.com").get();
        org.jsoup.select.Elements elements = document.select("");
        assertEquals("", elements.toString(), "");
    }

    public class Test {
        // no method, this should not compile.
    }
}

}