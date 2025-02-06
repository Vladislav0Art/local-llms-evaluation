package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsFormSubmittable {

    @Test
    public void isFormSubmittable() {
        boolean result = org.jsoup.parser.Tag.valueOf("input").isFormSubmittable();
        assertTrue(result);
    }

}