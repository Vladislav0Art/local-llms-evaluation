package org.jsoup.nodes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.jsoup.nodes.Comment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedOuterHtmlHeadTest {

    Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("comment");
    }

    @Test
    public void outerHtmlHeadTest() {
        String expectedResult = "<!--comment-->";
        StringBuilder accum = new StringBuilder();

        try {
            comment.outerHtmlHead(accum, 0, null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(expectedResult, accum.toString());
    }

}