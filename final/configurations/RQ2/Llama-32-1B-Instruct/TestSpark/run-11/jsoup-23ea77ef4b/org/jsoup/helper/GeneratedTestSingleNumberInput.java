package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestSingleNumberInput {

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
    public void testSingleNumberInput() {
        String expected = "1";
        Object actual = processInput("1");
        assertThat(actual, is(expected));
    }

}