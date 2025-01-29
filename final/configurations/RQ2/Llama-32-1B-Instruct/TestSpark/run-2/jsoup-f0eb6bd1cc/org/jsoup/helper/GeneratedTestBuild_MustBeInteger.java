package org.jsoup.helper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GeneratedTestBuild_MustBeInteger {

    private String input;
    private int offset;

    public String build() {
        return input + offset;
    }

    public void setInput(String input) {
        this.input = input;
        offset = 0;
    }

    @Test
    public void testBuild_MustBeInteger() {
        int[] nums = {1, 2, 3};
        String output = (String) build(nums);
        assertNotNull(output);
        assertEquals(4, Integer.parseInt(output));
    }

}