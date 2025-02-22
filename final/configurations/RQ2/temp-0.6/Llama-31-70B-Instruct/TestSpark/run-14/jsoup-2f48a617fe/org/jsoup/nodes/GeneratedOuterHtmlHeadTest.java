package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHeadTest {

    @Mock
    private Comment comment;

    @Test
    public void outerHtmlHeadTest() throws IOException {
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint(true);
        out.outline(true);
        comment.setData("Data");

        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<!--Data-->", accum.toString());
    }

}