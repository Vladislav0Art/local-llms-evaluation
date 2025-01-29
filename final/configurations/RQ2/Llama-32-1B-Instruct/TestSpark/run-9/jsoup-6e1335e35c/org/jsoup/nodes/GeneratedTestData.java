package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestData {

    @Test
    public void testData() {
        // Test with empty data
        String data = "";
        assertEquals("", customElement.data(data));

        // Test with non-empty data
        data = "Hello World";
        assertEquals("Hello World", customElement.data(data));
    }

}