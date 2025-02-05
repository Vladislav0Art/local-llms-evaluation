package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        String tagName = "p";
        Tag tag = Tag.valueOf(tagName);
        assertEquals(tagName, tag.getName());
    }

}