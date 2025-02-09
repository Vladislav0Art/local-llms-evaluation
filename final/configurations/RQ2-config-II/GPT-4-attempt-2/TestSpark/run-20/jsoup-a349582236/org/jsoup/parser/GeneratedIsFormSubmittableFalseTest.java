package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedIsFormSubmittableFalseTest {

    @Test
    public void isFormSubmittableFalseTest() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.isFormSubmittable());
    }

}