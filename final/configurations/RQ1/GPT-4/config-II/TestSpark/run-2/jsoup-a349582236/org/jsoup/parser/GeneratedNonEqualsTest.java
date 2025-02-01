package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNonEqualsTest {

    @Test
    public void nonEqualsTest() {
        Tag tag = Tag.valueOf("p");
        Tag otherTag = Tag.valueOf("img");
        assertFalse(tag.equals(otherTag));
    }

}