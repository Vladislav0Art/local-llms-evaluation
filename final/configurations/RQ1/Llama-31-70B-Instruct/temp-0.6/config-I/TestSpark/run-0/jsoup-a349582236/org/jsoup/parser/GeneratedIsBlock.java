package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.ParseSettings;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedIsBlock {

    private static final Map<String, Tag> tags = new HashMap<>();
    private Tag tag;

    @BeforeEach
    public void setUp() {
        tags.clear();
        tag = new Tag("p");
    }

    @Test
    public void isBlock() {
        assertTrue(tag.isBlock());
    }

}