package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        Document.OutputSettings out = new Document.OutputSettings();
        out.setIndentSize(4);
        String html = "<p>Hello World!</p>";
        Element element = parser.parseString(html, out);
        assertTrue(element.outerHtmlTail(new java.util.Arrays.asList(), 0, out).contains("<body></body>"));
    }

}