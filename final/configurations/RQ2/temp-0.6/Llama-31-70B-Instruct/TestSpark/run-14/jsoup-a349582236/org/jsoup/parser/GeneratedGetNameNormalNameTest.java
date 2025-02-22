package org.jsoup.parser;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedGetNameNormalNameTest {

    private Tag tag;

    @BeforeEach
    public void setUp() {
        tag = new Tag("div");
    }

    @Test
    public void getNameNormalNameTest() {
        assertEquals(tag.normalName, tag.normalName());
    }

}