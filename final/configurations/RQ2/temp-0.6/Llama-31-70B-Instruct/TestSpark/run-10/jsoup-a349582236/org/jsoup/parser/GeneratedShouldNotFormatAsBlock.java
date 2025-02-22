package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.Tag;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedShouldNotFormatAsBlock {

    @Test
    public void shouldNotFormatAsBlock() {
        String tagName = "span";
        Tag tag = Tag.valueOf(tagName);
        assertFalse(tag.formatAsBlock());
    }

}