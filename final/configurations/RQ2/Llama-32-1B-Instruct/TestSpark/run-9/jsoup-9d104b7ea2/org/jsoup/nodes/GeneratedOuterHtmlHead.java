package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedOuterHtmlHead {

    @Test
    public void outerHtmlHead() {
        Document document = new Document();
        Appendable accum = document.appendBody(new StringBuilder());
        outerHtmlHead(accum, 0, document);
        assertEquals("Hello, World!", getExpectedText(accum.toString()));
    }

}