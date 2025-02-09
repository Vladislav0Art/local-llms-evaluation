package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedCloneValidInputTest {

    @Test
    public void cloneValidInputTest() {
        Tag tag = Tag.valueOf("tag_name");
        Tag clonedTag = tag.clone();
        assertEquals(tag, clonedTag);
    }

}