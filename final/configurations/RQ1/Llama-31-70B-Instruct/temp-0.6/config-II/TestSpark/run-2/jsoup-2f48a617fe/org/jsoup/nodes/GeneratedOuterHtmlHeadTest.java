package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        String data = "data";
        Comment comment = new Comment(data);

        Appendable accum = mock(Appendable.class);
        int depth = 1;
        Document.OutputSettings out = mock(Document.OutputSettings.class);

        comment.outerHtmlHead(accum, depth, out);

        Mockito.verify(accum).append("<!--");
        Mockito.verify(accum).append(data);
        Mockito.verify(accum).append("-->");
    }

}