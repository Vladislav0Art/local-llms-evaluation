package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("data");
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        when(out.prettyPrint()).thenReturn(true);
        when(out.outline()).thenReturn(true);

        Appendable accum = new StringBuilder();
        comment.outerHtmlHead(accum, 1, out);

        assertEquals("  <!--data-->", accum.toString());
    }

}