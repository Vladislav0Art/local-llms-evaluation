package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.mockito.Mockito;

import java.lang.Cloneable;

public class GeneratedValueOf_ReturnsValue {

    @Test
    public void valueOf_ReturnsValue() {
        String tagName = "test";
        ParseSettings settings = Mockito.mock(ParseSettings.class);
        Tag result = Tag.valueOf(tagName, settings);
        assertNotNull(result);
    }

}