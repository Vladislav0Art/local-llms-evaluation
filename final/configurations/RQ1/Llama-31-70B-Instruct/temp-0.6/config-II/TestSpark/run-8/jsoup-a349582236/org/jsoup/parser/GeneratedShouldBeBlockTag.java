package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.Tag;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedShouldBeBlockTag {

    @Test
    public void shouldBeBlockTag() {
        Tag tag = new Tag("div");
        assertTrue(tag.isBlock());
    }

}