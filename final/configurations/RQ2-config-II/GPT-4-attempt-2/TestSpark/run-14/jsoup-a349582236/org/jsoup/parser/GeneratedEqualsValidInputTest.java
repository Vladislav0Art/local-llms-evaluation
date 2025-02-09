package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedEqualsValidInputTest {

    @Test
    public void equalsValidInputTest() {
        Tag tag1 = Tag.valueOf("tag_name");
        Tag tag2 = Tag.valueOf("tag_name");
        assertEquals(tag1, tag2);
    }

}