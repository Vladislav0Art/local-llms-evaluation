package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestMultipleInputs {

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
    public void testMultipleInputs() {
        String[] inputs = {"1,2,3", "a,b,c"};
        String[] expecteds = {"123", "abc"};
        for (String input : inputs) {
            Object actual = processInput(input);
            assertThat(actual, is(expecteds[0]));
        }
    }

}