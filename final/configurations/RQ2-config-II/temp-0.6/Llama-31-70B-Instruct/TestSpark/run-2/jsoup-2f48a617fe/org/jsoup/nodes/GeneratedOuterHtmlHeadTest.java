package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("Some data");
        StringBuilder sb = new StringBuilder();

        try {
            comment.outerHtmlHead(sb, 0, null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals("<!--Some data-->", sb.toString());
    }

}