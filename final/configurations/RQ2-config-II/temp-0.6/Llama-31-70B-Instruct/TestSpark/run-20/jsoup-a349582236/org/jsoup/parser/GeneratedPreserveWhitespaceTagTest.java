package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPreserveWhitespaceTagTest {

    @Test
    public void preserveWhitespaceTagTest() {
        Tag tag = new Tag("div");
        assertFalse(tag.preserveWhitespace());
    }

}