package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHashCodeExistingTagNameTest {

    @Test
    public void hashCodeExistingTagNameTest() {
        Tag tag = Tag.valueOf("body");
        assertEquals(tag.hashCode(), Tag.valueOf("body").hashCode());
    }

}