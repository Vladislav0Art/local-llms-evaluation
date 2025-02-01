package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        Tag tag = new Tag("p");
        assertEquals("p", tag.getName());
    }

}