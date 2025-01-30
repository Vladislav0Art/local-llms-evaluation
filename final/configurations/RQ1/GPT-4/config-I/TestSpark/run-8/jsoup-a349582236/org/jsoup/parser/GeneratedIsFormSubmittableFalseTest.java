package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFormSubmittableFalseTest {

    private ParseSettings defaultSettings = ParseSettings.preserveCase;

    @Test
    public void isFormSubmittableFalseTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isFormSubmittable());
    }

}