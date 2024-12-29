package org.jsoup.parser;

public class GeneratedInitialiseParse_WithValidReader_ReturnsTrue {

    @Test
    public void initialiseParse_WithValidReader_ReturnsTrue() {
        Reader reader = new StringReader("<html></html>");
        assertTrue(new XmlTreeBuilder().initialiseParse(reader, null, null));
    }

}