package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedOuterHtmlTail {

    @Test
    public void outerHtmlTail() {
        Document document = new Document();
        Appendable accum = document.appendBody(new StringBuilder());
        outerHtmlTail(accum, 0, document);
        assertEquals("", getExpectedText(accum.toString()));
    }

}