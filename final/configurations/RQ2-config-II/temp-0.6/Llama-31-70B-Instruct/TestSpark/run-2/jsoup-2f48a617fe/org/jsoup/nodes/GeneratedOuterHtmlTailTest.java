package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("Some data");
        StringBuilder sb = new StringBuilder();

        try {
            comment.outerHtmlTail(sb, 0, null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals("", sb.toString());
    }

}