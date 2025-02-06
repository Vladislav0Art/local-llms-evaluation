package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.mockito.Mockito;

import java.lang.Cloneable;

public class GeneratedValueOf_EmptyString_ThrowsNullPointerException {

    @Test
    public void valueOf_EmptyString_ThrowsNullPointerException() {
        String tagName = "";
        ParseSettings settings = Mockito.mock(ParseSettings.class);
        assertTrue(Validate.throwsNullPointerException(() -> Tag.valueOf(tagName, settings)));
    }

}