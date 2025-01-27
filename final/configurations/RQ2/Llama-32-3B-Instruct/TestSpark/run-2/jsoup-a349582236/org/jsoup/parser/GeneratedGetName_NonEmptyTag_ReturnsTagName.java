package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetName_NonEmptyTag_ReturnsTagName {

    @Test
    public void getName_NonEmptyTag_ReturnsTagName() {
        String tagName = "div";
        assertEquals("div", Tag.valueOf(tagName).getName());
    }

}