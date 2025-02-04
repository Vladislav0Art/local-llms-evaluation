package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlSetsCorrectHtml {

    @Test
    public void outerHtmlSetsCorrectHtml() {
        Comment comment = new Comment("test");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        comment.outerHtmlHead(accum, depth, out);
        String html = accum.toString();
        assertTrue(html.startsWith("<!--"));
        assertTrue(html.endsWith("-->"));
    }

}