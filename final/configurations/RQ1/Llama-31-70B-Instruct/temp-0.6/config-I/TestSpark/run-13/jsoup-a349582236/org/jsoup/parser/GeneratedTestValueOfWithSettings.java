package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestValueOfWithSettings {

    @Test
    public void testValueOfWithSettings() {
        ParseSettings settings = Mockito.mock(ParseSettings.class);
        Mockito.when(settings.normalizeTag(Mockito.anyString())).thenReturn("normalizedTag");
        String tagName = "p";
        Tag tag = Tag.valueOf(tagName, settings);

        assertNotNull(tag);
        assertEquals("normalizedTag", tag.tagName);
    }

}