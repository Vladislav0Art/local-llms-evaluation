package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestIsKnownTag {

    @Test
    public void testIsKnownTag() {
        Tag tag = new Tag("p");
        assertTrue(tag.isKnownTag());
    }

}