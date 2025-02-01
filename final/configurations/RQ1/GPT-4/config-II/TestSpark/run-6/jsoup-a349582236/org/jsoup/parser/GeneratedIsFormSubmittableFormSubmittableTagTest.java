package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFormSubmittableFormSubmittableTagTest {

    @Test
    public void isFormSubmittableFormSubmittableTagTest() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormSubmittable());
    }

}