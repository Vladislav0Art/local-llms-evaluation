package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedIsKnownTagTest {

    @Test
    public void isKnownTagTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.isKnownTag());
    }

}