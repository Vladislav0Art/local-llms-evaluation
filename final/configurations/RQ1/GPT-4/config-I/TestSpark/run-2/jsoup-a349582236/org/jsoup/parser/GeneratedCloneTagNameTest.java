package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTagNameTest {

    @Test
    public void cloneTagNameTest() {
        Tag tag = new Tag("tagName");
        Tag cloneTag = tag.clone();
        assertNotNull(cloneTag);
        assertNotSame(tag, cloneTag);
    }

}