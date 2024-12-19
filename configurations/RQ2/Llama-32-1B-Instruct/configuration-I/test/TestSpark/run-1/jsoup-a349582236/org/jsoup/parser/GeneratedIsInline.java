package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedIsInline {

    @Test
    public void isInline() {
        String tagName = "";
        Tag tag = Parser.parse(tagName).get();
        assertTrue(tag.isInline());
    }

}