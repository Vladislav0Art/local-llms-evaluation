package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Comment");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 1, new Document.OutputSettings());
        assertEquals("<!---->", accum.toString());
    }

}