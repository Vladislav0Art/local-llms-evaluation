package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetNameTagNameTest {

    @Test
    public void getNameTagNameTest() {
        Tag tag = new Tag("TestName");
        assertEquals("TestName", tag.getName());
    }

}