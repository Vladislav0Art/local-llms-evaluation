package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadWithPrettyPrintIsUsedWhenConditionsAreMet {

    @Test
    public void outerHtmlHeadWithPrettyPrintIsUsedWhenConditionsAreMet() {
        Comment comment = new Comment("test");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        comment.outerHtmlHead(accum, depth, out);
        verify(accum).append(eq("<!--"));
        verify(accum).append(eq(comment.getData()));
        verify(accum).append(eq("-->"));
    }

}