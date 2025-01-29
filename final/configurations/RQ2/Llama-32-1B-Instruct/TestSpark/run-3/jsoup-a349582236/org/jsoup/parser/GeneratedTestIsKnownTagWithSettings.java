package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestIsKnownTagWithSettings {

    @Test
    public void testIsKnownTagWithSettings() {
        Map<String, Object> settings = new HashMap<>();
        settings.put("type", "image");
        assertEquals(1, Tag.valueOf("img", settings).hashCode());
    }

}