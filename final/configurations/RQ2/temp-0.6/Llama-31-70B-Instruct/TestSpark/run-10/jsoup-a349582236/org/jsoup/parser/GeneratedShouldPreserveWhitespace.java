package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.Tag;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedShouldPreserveWhitespace {

    @Test
    public void shouldPreserveWhitespace() {
        String tagName = "pre";
        Tag tag = Tag.valueOf(tagName);
        assertTrue(tag.preserveWhitespace());
    }

}