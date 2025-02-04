package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlHead_commentWithSibling {

    @Test
    public void outerHtmlHead_commentWithSibling() throws IOException {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Comment comment = new Comment("This is a test");
        Element sibling = mock(Element.class);
        comment.parentNode = sibling;
        comment.siblingIndex = 0;
        comment.outerHtmlHead(accum, 0, out);
        verify(accum).append("<!--This is a test-->");
    }

}