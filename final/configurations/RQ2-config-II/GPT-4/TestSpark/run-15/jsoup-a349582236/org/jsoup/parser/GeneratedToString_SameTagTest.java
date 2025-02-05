package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedToString_SameTagTest {

    @Test
    public void toString_SameTagTest() {
        Tag tag1 = Tag.valueOf("input");
        assertEquals("<input>", tag1.toString());
    }

}