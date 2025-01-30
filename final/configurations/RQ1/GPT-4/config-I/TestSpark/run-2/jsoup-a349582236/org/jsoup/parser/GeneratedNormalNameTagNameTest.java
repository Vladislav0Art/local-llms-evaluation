package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormalNameTagNameTest {

    @Test
    public void normalNameTagNameTest() {
        Tag tag = new Tag("TestName");
        assertEquals("testname", tag.normalName());
    }

}