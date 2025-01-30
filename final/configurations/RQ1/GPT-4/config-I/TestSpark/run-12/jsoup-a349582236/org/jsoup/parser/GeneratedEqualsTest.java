package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Tag t = Tag.valueOf("p");
        Tag tag = t.clone().setSelfClosing();
        assertFalse(t.equals(tag));
    }

}