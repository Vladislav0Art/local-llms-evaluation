package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTextWithMultipleSpaces {

    public String dash(String originalString) {
        return originalString.replace("-", "-").replace("\"", "\"\"");
    }

    @Test
    public void testTextWithMultipleSpaces() {
        String originalString = "   Hello,  World!  ";
        String text = (new Text(originalString)).text();
        assertEquals("Hello,  World!", text.trim());
    }

}