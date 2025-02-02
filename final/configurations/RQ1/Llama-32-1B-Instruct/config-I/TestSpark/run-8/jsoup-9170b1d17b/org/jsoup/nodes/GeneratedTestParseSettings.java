package org.jsoup.nodes;

import java.util.Arrays;

public class GeneratedTestParseSettings {

    @Test
    public void testParseSettings() {
        Attributes attributes = new Attributes();
        int dupes = attributes.deduplicate(ParseSettings.IGNORECASE);

        for (int i = 0; i < dupes; i++) {
            String key = "a".repeat(2);
            assertEquals(keys[i], attributes.get(key));
        }

        assertThrows(ParseException.class, () -> attributes.get("b".repeat(1)));
    }

}