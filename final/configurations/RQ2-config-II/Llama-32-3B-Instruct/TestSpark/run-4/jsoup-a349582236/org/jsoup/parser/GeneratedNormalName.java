package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedNormalName {

    @Test
    public void normalName() {
        String tagName = "html";
        assertEquals("HTML", Tag.normalName(tagName));
    }

}