package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTextWithQuotationMarksAndDashes {

    @Test
    public void testTextWithQuotationMarksAndDashes() {
        String originalString = "\"   Hello\", World!\" ";
        String[] parts = originalString.split("\\s+");
        assertEquals(1, parts.length);
        String text = (new Text(parts[0])).text();
        assertEquals("Hello, World!", text.trim());
    }

}