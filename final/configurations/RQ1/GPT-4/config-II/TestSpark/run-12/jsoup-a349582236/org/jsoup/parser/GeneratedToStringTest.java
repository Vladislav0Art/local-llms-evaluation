package org.jsoup.parser;

import org.jsoup.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Tag tag = Tag.valueOf("img");
        assertEquals("img", tag.toString());
    }

}