package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_UncanonicalizedString_ReturnsCanonicalizedVersion {

    @Test
    public void normalName_UncanonicalizedString_ReturnsCanonicalizedVersion() {
        String tagName = "div";
        assertEquals("div", Tag.normalName(tagName));
    }

}