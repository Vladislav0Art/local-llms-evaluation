package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTextWithTrailingSpaces {

    public String dash(String originalString) {
        return originalString.replace("-", "-").replace("\"", "\"\"");
    }

    @Test
    public void testTextWithTrailingSpaces() {
        String originalString = "Hello, World!   ";
        String text = (new Text(originalString)).text();
        assertEquals(" Hello, World!", text.trim());
    }

}