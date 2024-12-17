package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestTextDoesntSplitIntoFive {

    @Test
    public void testTextDoesntSplitIntoFive() {
        String text = "Hello World this is an example";
        int[] result1 = text.splitText(5);
        assertThat(result1, is(new int[]{0, 1, 2, 3, 4}));
    }

}