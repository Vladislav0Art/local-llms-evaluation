package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedOuterHtmlTail_GivenAppendableAndDepth_NoThrow {

    @Test
    public void outerHtmlTail_GivenAppendableAndDepth_NoThrow() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        new TextNode().outerHtmlTail(accum, depth, out);
    }

}