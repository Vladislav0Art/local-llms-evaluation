package org.jsoup.parser;

public class GeneratedParse_WithInvalidInputFragment_ThrowsNullPointerException {

    @Test
    public void parse_WithInvalidInputFragment_ThrowsNullPointerException() {
        try {
            new XmlTreeBuilder().parse(null, null);
            assert false;
        } catch (NullPointerException e) {
            // Expected exception
        }
    }

}