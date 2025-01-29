package org.jsoup.parser;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetName {

    private Tag tag;

    @BeforeEach
    public void setup() {
        // TO DO: implement any necessary setup for the test
        tag = new Tag("test-tag");
    }

    @Test
    public void testGetName() {
        Assert.assertEquals("test-tag", tag.getName());
    }

}