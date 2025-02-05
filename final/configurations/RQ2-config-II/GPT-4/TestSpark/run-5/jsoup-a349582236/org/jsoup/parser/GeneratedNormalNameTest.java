package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormalNameTest {

    @Test
    public void normalNameTest() {
        String tagName = "i";
        Tag tag = Tag.valueOf(tagName);
        assertEquals(tagName, tag.normalName());
    }

}