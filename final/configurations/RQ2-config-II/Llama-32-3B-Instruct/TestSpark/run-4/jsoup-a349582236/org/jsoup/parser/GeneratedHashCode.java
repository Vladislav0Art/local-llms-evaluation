package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedHashCode {

    @Test
    public void hashCode() {
        String tagName1 = "div";
        String tagName2 = "div";

        assertEquals(0, org.jsoup.parser.Tag.valueOf(tagName1).hashCode());
        assertEquals(0, org.jsoup.parser.Tag.valueOf(tagName2).hashCode());

        assertEquals(Tag.selfClosing, org.jsoup.parser.Tag.valueOf("").hashCode());
    }

}