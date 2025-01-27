package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsEmpty_EmptyTag_ReturnsTrue {

    @Test
    public void isEmpty_EmptyTag_ReturnsTrue() {
        Tag tag = Tag.valueOf("");
        assertTrue(tag.isEmpty());
    }

}