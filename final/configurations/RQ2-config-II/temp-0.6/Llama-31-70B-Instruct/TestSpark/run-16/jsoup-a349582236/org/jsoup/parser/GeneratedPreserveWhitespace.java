package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPreserveWhitespace {

    @Test
    public void preserveWhitespace() {
        Tag tag = new Tag("test");
        assertFalse(tag.preserveWhitespace());
    }

}