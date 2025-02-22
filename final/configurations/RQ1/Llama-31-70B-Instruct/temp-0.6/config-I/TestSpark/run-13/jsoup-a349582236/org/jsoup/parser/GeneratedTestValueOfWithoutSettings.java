package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestValueOfWithoutSettings {

    @Test
    public void testValueOfWithoutSettings() {
        String tagName = "p";
        Tag tag = Tag.valueOf(tagName);

        assertNotNull(tag);
        assertEquals(tagName, tag.tagName);
    }

}