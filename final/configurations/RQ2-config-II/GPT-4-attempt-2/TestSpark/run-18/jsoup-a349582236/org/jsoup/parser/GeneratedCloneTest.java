package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Tag tag = Tag.valueOf("p");
        Tag clonedTag = tag.clone();
        assertNotNull(clonedTag);
        assertEquals(tag, clonedTag);
    }

}