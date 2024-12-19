package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedIsKnownTag {

    @Test
    public void isKnownTag() {
        String tagName = "p";
        Tag tag = Parser.parse(tagName).get();
        assertTrue(Tag.isKnownTag(tagName));
    }

}