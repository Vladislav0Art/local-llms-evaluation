package org.jsoup.parser;

public class GeneratedInitialiseParse_WithValidReader ReturnsTrue {

    @Test
    public void initialiseParse_WithValidReader

    ReturnsTrue() {
        Reader reader = new StringReader("<html></html>");
        assertTrue(new XmlTreeBuilder().initialiseParse(reader, null, null));
    }

}