package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

public class GeneratedOuterHtmlHeadWithPrettyPrintTest {

    @Test
    public void outerHtmlHeadWithPrettyPrintTest() throws IOException {
        Comment comment = new Comment("comment data");
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);

        when(out.prettyPrint()).thenReturn(true);

        comment.outerHtmlHead(accum, 0, out);

        assertNotNull(accum);
    }

}