package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Tag tag = new Tag("p");
        Tag cloned = tag.clone();
        assertNotSame(tag, cloned);
        assertEquals(tag.getName(), cloned.getName());
    }

}