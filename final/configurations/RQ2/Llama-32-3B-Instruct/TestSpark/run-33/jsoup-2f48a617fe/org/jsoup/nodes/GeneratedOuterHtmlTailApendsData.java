package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.LeafNode;

public class GeneratedOuterHtmlTailApendsData {

    @Test
    public void outerHtmlTailApendsData() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Comment comment = new Comment("data");
        comment.outerHtmlTail(accum, 0, out);
        verify(accum).append(eq("-->"));
    }

}