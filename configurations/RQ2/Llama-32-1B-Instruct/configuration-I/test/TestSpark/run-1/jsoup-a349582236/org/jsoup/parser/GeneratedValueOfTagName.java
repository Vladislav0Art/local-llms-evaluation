package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedValueOfTagName {

    @Test
    public void valueOfTagName() {
        String tagName = "div";
        Tag tag = Parser.parse(tagName).get();
        assertEquals(tag, Tag.valueOf(tagName));
    }

}