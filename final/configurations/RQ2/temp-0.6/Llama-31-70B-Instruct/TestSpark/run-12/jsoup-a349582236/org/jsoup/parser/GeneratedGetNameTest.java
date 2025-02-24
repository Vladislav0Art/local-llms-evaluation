package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        Tag tag = new Tag();
        String expectedName = "expectedName";
        assertEquals(expectedName, tag.getName());
    }

}