package org.jsoup.parser;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestIsFormListed {

    private Tag tag;

    @BeforeEach
    public void setup() {
        // TO DO: implement any necessary setup for the test
        tag = new Tag("test-tag");
    }

    @Test
    public void testIsFormListed() {
        // TO DO: implement this test
        Assert.assertFalse(tag.isFormListed());
    }

}