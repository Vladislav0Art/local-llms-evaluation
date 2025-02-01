package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFormListedFalseTest {

    @Test
    public void isFormListedFalseTest() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.isFormListed());
    }

}