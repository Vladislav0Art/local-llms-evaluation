package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFormSubmittableForNonFormTagTest {

    @Test
    public void isFormSubmittableForNonFormTagTest() {
        Tag tag = Tag.valueOf("body");
        assertFalse(tag.isFormSubmittable());
    }

}