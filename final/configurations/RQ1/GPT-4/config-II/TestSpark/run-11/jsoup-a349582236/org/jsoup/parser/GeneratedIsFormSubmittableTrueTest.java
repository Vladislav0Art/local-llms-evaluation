package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFormSubmittableTrueTest {

    @Test
    public void isFormSubmittableTrueTest() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormSubmittable());
    }

}