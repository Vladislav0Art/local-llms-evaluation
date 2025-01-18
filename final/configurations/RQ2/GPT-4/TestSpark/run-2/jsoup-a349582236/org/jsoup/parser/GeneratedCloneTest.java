package org.jsoup.parser;

import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Tag original = Tag.valueOf("p");
        Tag clone = original.clone();
        assertEquals(original, clone);
        assertNotSame(original, clone);
    }

}