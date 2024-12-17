package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestTextIsBlank {

    @Test
    public void testTextIsBlank() {
        // Initialize Node text
        String text = "Hello";

        // Test if text is blank
        System.out.println(ConfigurationI.isTextBlank(text));
    }

    private boolean isTextBlank(String text) {
        return text.isEmpty();
    }

}