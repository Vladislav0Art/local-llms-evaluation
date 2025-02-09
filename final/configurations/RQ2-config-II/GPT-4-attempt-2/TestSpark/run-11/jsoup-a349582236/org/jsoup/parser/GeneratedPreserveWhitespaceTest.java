package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedPreserveWhitespaceTest {

    @Test
    public void preserveWhitespaceTest() {
        Tag tag = new Tag("pre");
        assertTrue(tag.preserveWhitespace());
    }

}