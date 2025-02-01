package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTagsInequalityTest {

    @Test
    public void tagsInequalityTest() {
        Tag tag1 = Tag.valueOf("p");
        Tag tag2 = Tag.valueOf("div");
        assertNotEquals(tag1, tag2);
        assertNotEquals(tag1.hashCode(), tag2.hashCode());
    }

}