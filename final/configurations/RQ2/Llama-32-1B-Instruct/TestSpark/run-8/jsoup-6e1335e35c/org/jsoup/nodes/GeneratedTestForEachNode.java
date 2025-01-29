package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestForEachNode {

    @Test
    public void testForEachNode() {
        Document document = new Document();
        Element root = document.createElement("html");
        document.appendChild(root);
        String html = "<p>Hello World!</p><span>This is a test</span>";
        parser.parseString(html, root);
        assertTrue(document.getInnerHTML().contains("<p>Hello World!</p>"));
    }

}