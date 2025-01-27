package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_CanonicalizeTagName {

    @Test
    public void normalName_CanonicalizeTagName() {
        String tagName = "<div>";
        assertEquals("div", Tag.normalName(tagName));
    }

}