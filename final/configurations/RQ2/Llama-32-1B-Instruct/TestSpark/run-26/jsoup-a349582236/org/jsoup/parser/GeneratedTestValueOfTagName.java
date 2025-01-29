package org.jsoup.parser;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestValueOfTagName {

    private Tag tag;

    @BeforeEach
    public void setup() {
        // TO DO: implement any necessary setup for the test
        tag = new Tag("test-tag");
    }

    @Test
    public void testValueOfTagName() {
        ParseSettings settings = new ParseSettings();
        String tagName = "test-tag";
        Tag tag1 = Tag.valueOf(tagName, settings);
        // TO DO: implement this test
    }

}