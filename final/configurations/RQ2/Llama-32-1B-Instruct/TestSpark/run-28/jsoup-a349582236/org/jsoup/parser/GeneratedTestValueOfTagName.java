package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestValueOfTagName {

    private Tag tag;

    @Before
    public void setUp() {
        tag = new Tag();
    }

    @Test
    public void testValueOfTagName() {
        Tag tagName = Tag.valueOf("p");
        assertEquals(tagName, tagName);
    }

}