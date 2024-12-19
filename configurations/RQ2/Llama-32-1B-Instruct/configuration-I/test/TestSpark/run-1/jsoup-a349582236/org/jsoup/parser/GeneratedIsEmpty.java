package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedIsEmpty {

    @Test
    public void isEmpty() {
        String tagName = "div";
        Tag tag = Parser.parse(tagName).get();
        assertFalse(tag.isEmpty());
    }

}