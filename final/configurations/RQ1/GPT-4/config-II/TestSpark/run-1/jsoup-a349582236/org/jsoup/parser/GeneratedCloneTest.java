package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Tag t1 = new Tag("div");
        Tag t2 = t1.clone();
        assertEquals(t1, t2);
    }

}