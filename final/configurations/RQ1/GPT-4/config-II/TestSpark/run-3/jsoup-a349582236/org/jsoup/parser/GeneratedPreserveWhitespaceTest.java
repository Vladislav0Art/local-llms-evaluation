package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedPreserveWhitespaceTest {

    @Test
    public void preserveWhitespaceTest() {
        Tag tag = new Tag("pre");
        assertTrue(tag.preserveWhitespace());
    }

}