package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtml ReturnsCorrectOuterHTML {

    @Test
    public void outerHtml

    ReturnsCorrectOuterHTML() throws IOException {
        Comment comment = new Comment("<!-- Some XML Declaration -->");
        Appendable accum = mock(appendable.class);
        Document.OutputSettings out = mock(outputSettings.class);
        Document doc = mock(document.class);
        when(out.prettyPrint()).thenReturn(true);
        when(doc.body().children().size()).thenReturn(1);
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<!-- Some XML Declaration -->", accum.toString());
    }

}