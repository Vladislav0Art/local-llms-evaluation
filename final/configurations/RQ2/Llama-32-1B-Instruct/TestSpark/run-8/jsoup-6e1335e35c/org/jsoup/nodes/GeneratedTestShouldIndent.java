package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestShouldIndent {

    @Test
    public void testShouldIndent() {
        Document.OutputSettings out = new Document.OutputSettings();
        out.setIndentSize(4);
        String html = "<p>Hello World!</p>";
        Element element = parser.parseString(html, out);
        assertTrue(element.outerHtmlHead(new java.util.Arrays.asList(), 0, out).contains(" <pre>"));
    }

}