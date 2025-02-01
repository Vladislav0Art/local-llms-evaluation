package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Tag tag = Tag.valueOf("p");
        Tag otherTag = tag.equals(tag.clone());
        assertTrue(tag.equals(otherTag));
    }

}