package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsEmpty_ReturnsFalseIfNotEmpty {

    @Test
    public void isEmpty_ReturnsFalseIfNotEmpty() {
        Tag tag = new Tag();
        tag.setName("tagName");
        assertFalse(tag.isEmpty());
    }

}