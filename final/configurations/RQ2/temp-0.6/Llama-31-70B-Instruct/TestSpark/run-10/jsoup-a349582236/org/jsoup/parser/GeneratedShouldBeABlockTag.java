package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.Tag;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedShouldBeABlockTag {

    @Test
    public void shouldBeABlockTag() {
        String tagName = "div";
        Tag tag = Tag.valueOf(tagName);
        assertTrue(tag.isBlock());
    }

}