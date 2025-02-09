package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedHashCodeValidInputTest {

    @Test
    public void hashCodeValidInputTest() {
        Tag tag = Tag.valueOf("tag_name");
        int expectedHashCode = "tag_name".hashCode();
        assertEquals(expectedHashCode, tag.hashCode());
    }

}