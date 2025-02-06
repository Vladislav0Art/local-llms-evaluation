package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedOuterHtmlTail_PutsTailTagsInCorrectFormat {

    @Test
    public void outerHtmlTail_PutsTailTagsInCorrectFormat() throws Exception {
        StringBuilder expected = new StringBuilder("<tail></tail>");
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(false, false, true);
        TextNode node = new TextNode("");
        node.outerHtmlTail(accum, 1, out);
        assertEquals(expected.toString(), accum.toString());
    }

}