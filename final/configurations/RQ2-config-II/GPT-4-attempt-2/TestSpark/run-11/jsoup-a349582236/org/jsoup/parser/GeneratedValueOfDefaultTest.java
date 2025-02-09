package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedValueOfDefaultTest {

    @Test
    public void valueOfDefaultTest() {
        Tag tag = Tag.valueOf("test");
        assertEquals("test", tag.getName());
    }

}