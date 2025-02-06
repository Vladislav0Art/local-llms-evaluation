package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedEquals {

    @Test
    public void equals() {
        String tagName1 = "div";
        String tagName2 = "div";

        boolean result1 = Tag.valueOf(tagName1).equals(org.jsoup.parser.Tag.valueOf(tagName2));
        assertTrue(result1);

        boolean result2 = org.jsoup.parser.Tag.valueOf("").equals(org.jsoup.parser.Tag.valueOf(""));
        assertTrue(result2);
    }

}