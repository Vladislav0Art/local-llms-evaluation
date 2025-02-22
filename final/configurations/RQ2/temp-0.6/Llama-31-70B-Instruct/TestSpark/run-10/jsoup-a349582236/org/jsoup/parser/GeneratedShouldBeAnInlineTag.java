package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.Tag;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedShouldBeAnInlineTag {

    @Test
    public void shouldBeAnInlineTag() {
        String tagName = "span";
        Tag tag = Tag.valueOf(tagName);
        assertFalse(tag.isBlock());
    }

}