package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedFormatAsBlock {

    @Test
    public void formatAsBlock() {
        String tagName = "p";
        Tag tag = Parser.parse(tagName).get();
        assertFalse(tag.formatAsBlock());
    }

}