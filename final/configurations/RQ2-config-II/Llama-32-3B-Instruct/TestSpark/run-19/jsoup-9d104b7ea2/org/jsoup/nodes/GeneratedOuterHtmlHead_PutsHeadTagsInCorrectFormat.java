package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedOuterHtmlHead_PutsHeadTagsInCorrectFormat {

    @Test
    public void outerHtmlHead_PutsHeadTagsInCorrectFormat() throws Exception {
        StringBuilder expected = new StringBuilder("<head></head>");
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true, false, true);
        TextNode node = new TextNode("");
        node.outerHtmlHead(accum, 1, out);
        assertEquals(expected.toString(), accum.toString());
    }

}