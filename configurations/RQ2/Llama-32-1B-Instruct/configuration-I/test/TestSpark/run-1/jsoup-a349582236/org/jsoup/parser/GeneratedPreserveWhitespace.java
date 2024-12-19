package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedPreserveWhitespace {

    @Test
    public void preserveWhitespace() {
        String tagName = "p";
        Tag tag = Parser.parse(tagName).get();
        assertTrue(tag.preserveWhitespace());
    }

}