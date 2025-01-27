package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsEmpty_NonEmptyTag_ReturnsFalse {

    @Test
    public void isEmpty_NonEmptyTag_ReturnsFalse() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isEmpty());
    }

}