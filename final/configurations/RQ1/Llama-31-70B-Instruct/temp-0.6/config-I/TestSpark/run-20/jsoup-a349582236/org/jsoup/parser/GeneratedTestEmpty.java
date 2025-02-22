package org.jsoup.parser;

import static org.junit.jupiter.api.Assertions.*;

import org.jsoup.parser.Tag;
import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestEmpty {

    private final Tag tag = new Tag("testTagName");

    @Test
    public void testEmpty() {
        assertFalse(tag.isEmpty());
    }

}