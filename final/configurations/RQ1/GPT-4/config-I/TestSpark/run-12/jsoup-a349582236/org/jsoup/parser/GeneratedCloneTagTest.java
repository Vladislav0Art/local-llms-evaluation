package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

public class GeneratedCloneTagTest {

    @Test
    public void cloneTagTest() {
        Tag t1 = Tag.valueOf("p");
        Tag t2 = t1.clone();
        assertNotSame(t1, t2);
        assertEquals(t1, t2);
    }

}