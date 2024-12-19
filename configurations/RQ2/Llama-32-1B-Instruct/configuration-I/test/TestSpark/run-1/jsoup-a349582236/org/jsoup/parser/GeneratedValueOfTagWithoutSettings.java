package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedValueOfTagWithoutSettings {

    @Test
    public void valueOfTagWithoutSettings() {
        String tagName = "div";
        Tag tag = Parser.parse(tagName).get();
        assertEquals("div", Tag.valueOf(tagName, null));
    }

}