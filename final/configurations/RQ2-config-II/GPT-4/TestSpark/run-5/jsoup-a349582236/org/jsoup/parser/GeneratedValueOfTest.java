package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfTest {

    @Test
    public void valueOfTest() {
        String tagName = "div";
        Tag tag = Tag.valueOf(tagName);
        assertSame(Tag.valueOf(tagName), tag);
    }

}