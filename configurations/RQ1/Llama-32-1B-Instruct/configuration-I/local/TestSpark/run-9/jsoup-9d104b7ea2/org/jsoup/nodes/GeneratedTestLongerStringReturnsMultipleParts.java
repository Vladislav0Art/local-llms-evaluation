package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestLongerStringReturnsMultipleParts {

    @Test
    public void testLongerStringReturnsMultipleParts() {
        String text = "Hello World this is an example with many words";
        int[] result1 = text.splitText(5);
        assertThat(result1, is(new int[]{0, 4, 2, 3, 1}));
    }

}