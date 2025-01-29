package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestValueOfTagNamesWithSettings {

    @Test
    public void testValueOfTagNamesWithSettings() {
        Map<String, ParseSettings> settings = new HashMap<>();
        settings.put("type", "script");
        assertEquals(1, Tag.valueOf("script", settings).hashCode());
    }

}