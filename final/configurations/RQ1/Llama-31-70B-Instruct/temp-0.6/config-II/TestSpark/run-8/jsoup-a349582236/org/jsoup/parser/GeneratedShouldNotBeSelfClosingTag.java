package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.Tag;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedShouldNotBeSelfClosingTag {

    @Test
    public void shouldNotBeSelfClosingTag() {
        Tag tag = new Tag("div");
        assertFalse(tag.isSelfClosing());
    }

}