package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHashCodeTagNameTest {

    @Test
    public void hashCodeTagNameTest() {
        Tag tag = new Tag("tagName");
        assertEquals(-1981095963, tag.hashCode());
    }

}