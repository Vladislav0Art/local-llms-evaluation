package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsFormListed {

    @Test
    public void isFormListed() {
        boolean result = org.jsoup.parser.Tag.valueOf("form").isFormListed();
        assertTrue(result);
    }

}