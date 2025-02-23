package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestValueOf_String {

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    /**
     * Test of valueOf method, of class Tag.
     */

    @Test
    public void testValueOf_String() {
        String tagName = "test";
        Tag expResult = new Tag(tagName);
        Tag result = Tag.valueOf(tagName);
        assertEquals(expResult, result);
    }

}