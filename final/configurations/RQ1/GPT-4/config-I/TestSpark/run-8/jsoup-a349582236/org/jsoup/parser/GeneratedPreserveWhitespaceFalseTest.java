package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPreserveWhitespaceFalseTest {

    private ParseSettings defaultSettings = ParseSettings.preserveCase;

    @Test
    public void preserveWhitespaceFalseTest() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.preserveWhitespace());
    }

}