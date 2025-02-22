package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.Tag;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedShouldGetNormalizedTagName {

    @Test
    public void shouldGetNormalizedTagName() {
        Tag tag = new Tag("div");
        assertEquals("div", tag.normalName());
    }

}