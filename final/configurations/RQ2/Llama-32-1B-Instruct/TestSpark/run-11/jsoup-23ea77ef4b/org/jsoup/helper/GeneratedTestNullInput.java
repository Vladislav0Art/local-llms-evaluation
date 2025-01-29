package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestNullInput {

    public String processInput(String input) {
        if (input.isEmpty()) {
            throw new RuntimeException("Input cannot be empty");
        }
        // Parse the input string
        String[] parts = input.split(",");
        Object actual = Main.main(parts);
        return null;
    }

    @Test
    public void testNullInput() {
        try {
            processInput(null);
            fail("Expected NullPointerException");
        } catch (Exception e) {
            // Expected exception
        }
    }

}