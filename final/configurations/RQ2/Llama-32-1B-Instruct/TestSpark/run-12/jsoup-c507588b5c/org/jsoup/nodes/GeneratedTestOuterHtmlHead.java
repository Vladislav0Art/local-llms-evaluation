package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        String expected = "<head></head>";
        Assert.assertEquals(expected, new TextNode("").outerHtmlHead(new Appendable[]{}, 0, Document.OutputSettings.DEFAULT));
        assertEquals(expected, new TextNode(new String[]{}).outerHtmlHead(new Appendable[]{}, 0, Document.OutputSettings.DEFAULT));
        assertEquals(expected, new TextNode(null).outerHtmlHead(new Appendable[]{}, 0, Document.OutputSettings.DEFAULT));
    }

}