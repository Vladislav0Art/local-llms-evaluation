package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFormSubmittableTagTest {

    @Test
    public void isFormSubmittableTagTest() {
        Tag tag = new Tag("div");
        assertFalse(tag.isFormSubmittable());
    }

}