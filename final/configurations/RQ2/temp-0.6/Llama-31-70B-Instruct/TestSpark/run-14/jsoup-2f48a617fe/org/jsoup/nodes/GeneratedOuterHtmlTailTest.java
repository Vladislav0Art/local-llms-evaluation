package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlTailTest {

    @Mock
    private Comment comment;

    @Test
    public void outerHtmlTailTest() {
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint(true);
        out.outline(true);
        comment.setData("Data");

        comment.outerHtmlTail(accum, 0, out);
        assertEquals("", accum.toString());
    }

}