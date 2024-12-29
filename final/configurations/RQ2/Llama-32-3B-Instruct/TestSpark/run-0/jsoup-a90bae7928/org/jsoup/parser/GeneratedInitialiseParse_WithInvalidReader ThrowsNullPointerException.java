package org.jsoup.parser;

public class GeneratedInitialiseParse_WithInvalidReader ThrowsNullPointerException {

    @Test
    public void initialiseParse_WithInvalidReader

    ThrowsNullPointerException() {
        try {
            new XmlTreeBuilder().initialiseParse(null, null, null);
            assert false;
        } catch (NullPointerException e) {
            // Expected exception
        }
    }

}