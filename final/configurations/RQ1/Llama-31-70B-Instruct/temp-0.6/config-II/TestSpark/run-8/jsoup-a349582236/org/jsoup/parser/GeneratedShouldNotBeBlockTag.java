package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.Tag;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedShouldNotBeBlockTag {

    @Test
    public void shouldNotBeBlockTag() {
        Tag tag = new Tag("span");
        assertFalse(tag.isBlock());
    }

}