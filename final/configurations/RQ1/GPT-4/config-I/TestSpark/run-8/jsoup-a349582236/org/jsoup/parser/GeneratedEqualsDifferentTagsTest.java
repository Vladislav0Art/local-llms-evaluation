package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsDifferentTagsTest {

    private ParseSettings defaultSettings = ParseSettings.preserveCase;

    @Test
    public void equalsDifferentTagsTest() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("p");
        assertFalse(tag1.equals(tag2));
    }

}