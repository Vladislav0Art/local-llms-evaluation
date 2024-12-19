package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedNormalName {

    @Test
    public void normalName() {
        String tagName = "div";
        Tag tag = Parser.parse(tagName).get();
        assertEquals(tagName, tag.normalName());
    }

}