package org.jsoup.safety;

public class GeneratedTest {

    @Test
    public void testSimpleText() {
        org.jsoup.nodes.Document document = org.jsoup.Jsoup.connect("http://example.com").get();
        org.jsoup.select.Elements elements = document.select("");
        assertEquals("", elements.toString(), "");
    }

    @Test
    public void testAttributes() {
        org.jsoup.nodes.Document document = org.jsoup.Jsoup.connect("http://example.com").get();
        org.jsoup.select.Elements elements = document.select("");
        assertEquals("", elements.toString(), "");
    }

    @Test
    public void testProtocols() {
        org.jsoup.nodes.Document document = org.jsoup.Jsoup.connect("http://example.com").get();
        org.jsoup.select.Elements elements = document.select("");
        assertEquals("", elements.toString(), "");
    }
}

@Test
public void testSimpleText() {
    org.jsoup.nodes.Document document = org.jsoup.Jsoup.connect("http://example.com").get();
    org.jsoup.select.Elements elements = document.select("");
    assertEquals("", elements.toString(), "");
}

@Test
public void testAttributes() {
    org.jsoup.nodes.Document document = org.jsoup.Jsoup.connect("http://example.com").get();
    org.jsoup.select.Elements elements = document.select("");
    assertEquals("", elements.toString(), "");
}

@Test
public void testProtocols() {
    org.jsoup.nodes.Document document = org.jsoup.Jsoup.connect("http://example.com").get();
    org.jsoup.select.Elements elements = document.select("");
    assertEquals("", elements.toString(), "");
}

}