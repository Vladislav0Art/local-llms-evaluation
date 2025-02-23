package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("hello");
        String expected = "<!--hello-->";
        StringBuilder actual = new StringBuilder();
        comment.outerHtmlHead(actual, 0, Mockito.mock(Document.OutputSettings.class));
        assertEquals(expected, actual.toString());
    }

}