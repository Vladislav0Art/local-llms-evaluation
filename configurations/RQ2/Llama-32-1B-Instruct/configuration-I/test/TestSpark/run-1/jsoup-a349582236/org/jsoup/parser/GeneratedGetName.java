package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedGetName {

    @Test
    public void getName() {
        String tagName = "div";
        Tag tag = Parser.parse(tagName).get();
        assertEquals("div", tag.getName());
    }

}