package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedIsBlock {

    @Test
    public void isBlock() {
        String tagName = "p";
        Tag tag = Parser.parse(tagName).get();
        assertTrue(tag.isBlock());
    }

}