package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedIsSelfClosing {

    @Test
    public void isSelfClosing() {
        String tagName = "";
        Tag tag = Parser.parse(tagName).get();
        assertTrue(tag.isSelfClosing());
    }

}