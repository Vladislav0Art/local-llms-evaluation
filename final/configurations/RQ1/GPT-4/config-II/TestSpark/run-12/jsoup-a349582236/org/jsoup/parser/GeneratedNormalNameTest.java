package org.jsoup.parser;

import org.jsoup.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormalNameTest {

    @Test
    public void normalNameTest() {
        Tag tag = new Tag("P");
        assertEquals("p", tag.normalName());
    }

}