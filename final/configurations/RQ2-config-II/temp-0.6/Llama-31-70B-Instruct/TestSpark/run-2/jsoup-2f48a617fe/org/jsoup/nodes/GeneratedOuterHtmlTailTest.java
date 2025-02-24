package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("Comment");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlTail(accum, 1, new Document.OutputSettings());
        assertEquals("", accum.toString());
    }

}