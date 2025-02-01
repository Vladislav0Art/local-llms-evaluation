package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Tag tag = new Tag("p");
        int hash = tag.hashCode();
        assertEquals(hash, tag.hashCode());
    }

}