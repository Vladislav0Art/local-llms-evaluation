package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("test");
        String expected = "<!--test-->";
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, null);

        assertEquals(expected, accum.toString());
    }

}