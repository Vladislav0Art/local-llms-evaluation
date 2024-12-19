package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTextWithQuotes {

    @Test
    public void testTextWithQuotes() {
        String originalString = "\"Hello, World!\"";
        String[] parts = originalString.split("\"");
        assertEquals(1, parts.length);
        String text = (new Text(parts[0])).text();
        assertEquals("Hello, World!", text.trim());
    }

}