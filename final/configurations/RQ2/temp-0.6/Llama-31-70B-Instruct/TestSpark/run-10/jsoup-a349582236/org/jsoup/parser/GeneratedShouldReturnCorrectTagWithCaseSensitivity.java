package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.Tag;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedShouldReturnCorrectTagWithCaseSensitivity {

    @Test
    public void shouldReturnCorrectTagWithCaseSensitivity() {
        String tagName = "P";
        Tag tag = Tag.valueOf(tagName, ParseSettings.preserveCase);
        assertEquals(tagName, tag.getName());
    }

}