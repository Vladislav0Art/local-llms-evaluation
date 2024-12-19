package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedIsFormSubmittable {

    @Test
    public void isFormSubmittable() {
        String tagName = "form";
        Tag tag = Parser.parse(tagName).get();
        assertFalse(tag.isFormSubmittable());
    }

}