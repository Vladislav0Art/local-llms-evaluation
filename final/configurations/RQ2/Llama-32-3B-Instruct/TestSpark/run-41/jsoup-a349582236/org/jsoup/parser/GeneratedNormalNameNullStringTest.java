package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.helper.ParseSettings;

public class GeneratedNormalNameNullStringTest {

    @Test
    public void normalNameNullStringTest() {
        assertNull(Tag.valueOf(null).normalName());
    }

}