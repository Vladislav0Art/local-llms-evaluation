package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.Tag;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedShouldReturnCorrectTag {

    @Test
    public void shouldReturnCorrectTag() {
        String tagName = "p";
        Tag tag = Tag.valueOf(tagName);
        assertEquals(tagName, tag.getName());
    }

}