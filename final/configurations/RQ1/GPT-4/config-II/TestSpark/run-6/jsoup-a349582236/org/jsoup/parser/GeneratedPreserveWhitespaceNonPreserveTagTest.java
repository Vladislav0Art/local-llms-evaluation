package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPreserveWhitespaceNonPreserveTagTest {

    @Test
    public void preserveWhitespaceNonPreserveTagTest() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.preserveWhitespace());
    }

}