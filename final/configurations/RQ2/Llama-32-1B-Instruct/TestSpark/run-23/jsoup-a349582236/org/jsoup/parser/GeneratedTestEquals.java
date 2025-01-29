package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestEquals {

    private String tagName = "p";
    private Map<String, Boolean> expectedValue = new HashMap<>();

    @BeforeEach
    public void setup() {
        Mockito.reset(Parser.class);
    }

    @Test
    public void testEquals() {
        String tag1 = "div";
        String tag2 = "p";
        Tag tag3 = new Tag(tag1, Parser.parseSettings());
        Tag tag4 = new Tag(tag2, Parser.parseSettings());

        assertEquals(tag1, tag3.toString());
        Mockito.verify(tag3).equals(tag4);
    }

}