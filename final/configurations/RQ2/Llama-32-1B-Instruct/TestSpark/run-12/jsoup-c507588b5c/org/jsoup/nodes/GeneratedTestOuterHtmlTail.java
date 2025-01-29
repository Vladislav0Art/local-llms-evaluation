package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        String expected = "</head>";
        Assert.assertEquals(expected, new TextNode("").outerHtmlTail(new Appendable[]{}, 0, Document.OutputSettings.DEFAULT));
        assertEquals(expected, new TextNode(new String[]{}).outerHtmlTail(new Appendable[]{}, 0, Document.OutputSettings.DEFAULT));
        assertEquals(expected, new TextNode(null).outerHtmlTail(new Appendable[]{}, 0, Document.OutputSettings.DEFAULT));
    }

}