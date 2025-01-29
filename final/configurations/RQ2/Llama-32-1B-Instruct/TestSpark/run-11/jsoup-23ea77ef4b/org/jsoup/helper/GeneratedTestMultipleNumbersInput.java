package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestMultipleNumbersInput {

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
    public void testMultipleNumbersInput() {
        String[] inputs = {"1,2", "3,4"};
        String[] expecteds = {"1,2", "3,4"};
        for (String input : inputs) {
            Object actual = processInput(input);
            assertThat(actual, is(expecteds[0]));
        }
    }

}