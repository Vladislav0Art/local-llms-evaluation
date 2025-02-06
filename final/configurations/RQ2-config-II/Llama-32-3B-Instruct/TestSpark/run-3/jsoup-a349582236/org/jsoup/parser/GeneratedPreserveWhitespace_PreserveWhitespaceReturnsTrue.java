package org.jsoup.parser;

public class GeneratedPreserveWhitespace_PreserveWhitespaceReturnsTrue {

    @Test
    public void preserveWhitespace_PreserveWhitespaceReturnsTrue() {
        assertTrue(Tag.valueOf("<div>   </div>").preserveWhitespace());
    }

}