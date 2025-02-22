package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.Tag;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedShouldFormatAsBlock {

    @Test
    public void shouldFormatAsBlock() {
        String tagName = "p";
        Tag tag = Tag.valueOf(tagName);
        assertTrue(tag.formatAsBlock());
    }

}