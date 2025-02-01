package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedIsBlockTest {

    @Test
    public void isBlockTest() {
        Tag tag = new Tag("p");
        assertFalse(tag.isBlock());
    }

}