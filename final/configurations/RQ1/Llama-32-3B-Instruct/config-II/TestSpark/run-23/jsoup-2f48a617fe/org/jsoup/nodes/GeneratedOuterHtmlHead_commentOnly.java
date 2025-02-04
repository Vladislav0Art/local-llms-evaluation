package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlHead_commentOnly {

    @Test
    public void outerHtmlHead_commentOnly() throws IOException {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Comment comment = new Comment("This is a test");
        comment.outerHtmlHead(accum, 0, out);
        verify(accum).append("<!--This is a test-->");
    }

}