package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("test data");
        Appendable accum = Mockito.mock(Appendable.class);
        when(accum.append(Mockito.anyString())).thenReturn(accum);
        comment.outerHtmlHead(accum, 0, new Document.OutputSettings());
        Mockito.verify(accum).append("<!--test data-->");
    }

}