package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToString_AlwaysReturnsCorrectString {

    @Test
    public void toString_AlwaysReturnsCorrectString() {
        Tag tag = new Tag();
        String name = "test";
        assertEquals(name, tag.toString());
    }

}