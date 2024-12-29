package org.jsoup.parser;

public class GeneratedInitialiseParse_WithInvalidReader_ThrowsNullPointerException {

    @Test
    public void initialiseParse_WithInvalidReader_ThrowsNullPointerException() {
        try {
            new XmlTreeBuilder().initialiseParse(null, null, null);
            assert false;
        } catch (NullPointerException e) {
            // Expected exception
        }
    }

}