package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.Tag;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedShouldGetTagName {

    @Test
    public void shouldGetTagName() {
        Tag tag = new Tag("div");
        assertEquals("div", tag.getName());
    }

}