package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.Tag;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedShouldNotBeEmptyTag {

    @Test
    public void shouldNotBeEmptyTag() {
        Tag tag = new Tag("div");
        assertFalse(tag.isEmpty());
    }

}