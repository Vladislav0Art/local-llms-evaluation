package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestTextSplitsIntoFour {

    @Test
    public void testTextSplitsIntoFour() {
        String text = "Hello World this is an example";
        int[] result1 = text.splitText(4);
        assertThat(result1, is(new int[]{0, 1, 2, 3}));

        int[] result2 = text.splitText(5);
        assertThat(result2, is(new int[]{0, 1, 2, 3, 4}));
    }

}