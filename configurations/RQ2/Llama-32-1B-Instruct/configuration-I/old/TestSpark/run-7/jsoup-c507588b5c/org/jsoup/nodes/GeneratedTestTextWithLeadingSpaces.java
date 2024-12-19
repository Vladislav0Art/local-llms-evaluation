package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTextWithLeadingSpaces {

    public String dash(String originalString) {
        return originalString.replace("-", "-").replace("\"", "\"\"");
    }

    @Test
    public void testTextWithLeadingSpaces() {
        String originalString = "   Hello  World!  ";
        String text = (new Text(originalString)).text();
        assertEquals(" Hello, World!", text.trim());
    }

}