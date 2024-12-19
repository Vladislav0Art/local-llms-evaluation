package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedIsFormListed {

    @Test
    public void isFormListed() {
        String tagName = "form";
        Tag tag = Parser.parse(tagName).get();
        assertFalse(tag.isFormListed());
    }

}