package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFormSubmittableTrueTest {

    private ParseSettings defaultSettings = ParseSettings.preserveCase;

    @Test
    public void isFormSubmittableTrueTest() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormSubmittable());
    }

}