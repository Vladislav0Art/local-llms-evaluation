package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestEmptyStringReturnsFour {

    @Test
    public void testEmptyStringReturnsFour() {
        String text = "";
        int[] result = text.splitText(4);
        assertThat(result, is(new int[]{0, 1, 2, 3}));
    }

}