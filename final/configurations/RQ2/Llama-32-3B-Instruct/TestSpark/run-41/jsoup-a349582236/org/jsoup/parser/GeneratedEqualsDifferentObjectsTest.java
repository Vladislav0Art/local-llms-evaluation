package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.helper.ParseSettings;

public class GeneratedEqualsDifferentObjectsTest {

    @Test
    public void equalsDifferentObjectsTest() {
        Tag tag1 = new Tag("");
        Tag tag2 = new Tag("");
        assertFalse(new Tag("").equals(tag2));
    }

}