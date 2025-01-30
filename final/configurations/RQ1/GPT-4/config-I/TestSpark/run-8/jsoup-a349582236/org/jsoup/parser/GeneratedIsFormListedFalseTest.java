package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFormListedFalseTest {

    private ParseSettings defaultSettings = ParseSettings.preserveCase;

    @Test
    public void isFormListedFalseTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isFormListed());
    }

}