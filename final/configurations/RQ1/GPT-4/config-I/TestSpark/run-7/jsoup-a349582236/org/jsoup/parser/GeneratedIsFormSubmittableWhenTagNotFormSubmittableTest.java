package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFormSubmittableWhenTagNotFormSubmittableTest {

    @Test
    public void isFormSubmittableWhenTagNotFormSubmittableTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isFormSubmittable());
    }

}