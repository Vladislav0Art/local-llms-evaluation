package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsEmpty_emptyTag {

    @Test
    public void isEmpty_emptyTag() {
        Tag tag = new Tag("");
        assertTrue(tag.isEmpty());
    }

}