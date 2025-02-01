package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Tag tag = new Tag("p");
        assertEquals("p", tag.toString());
    }

}