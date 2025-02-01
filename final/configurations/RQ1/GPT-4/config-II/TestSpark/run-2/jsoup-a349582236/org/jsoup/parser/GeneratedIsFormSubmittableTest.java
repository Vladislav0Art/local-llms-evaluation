package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFormSubmittableTest {

    @Test
    public void isFormSubmittableTest() {
        assertTrue(Tag.valueOf("input").isFormSubmittable());
        assertFalse(Tag.valueOf("p").isFormSubmittable());
    }

}