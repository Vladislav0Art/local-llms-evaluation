package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTestReflectedValues {

    @Test
    public void testReflectedValues() throws NoSuchFieldException, IllegalAccessException {
        Tag tag1 = Tag.valueOf("div");
        Field field = Tag.class.getDeclaredField("isBlock");
        field.setAccessible(true);
        Boolean isBlock = (Boolean) field.get(tag1);
        Field field2 = Tag.class.getDeclaredField("preserveWhitespace");
        field2.setAccessible(true);
        Boolean preserveWhitespace = (Boolean) field2.get(tag1);
        assertTrue(isBlock);
        assertFalse(preserveWhitespace);
    }

}