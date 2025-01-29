package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestRoot {

    @Test
    public void testRoot() {
        Document document = new Document();
        Element root = document.createElement("html");
        document.appendChild(root);
        String html = "<head><title>Hello World!</title></head><body>Hello World!</body>";
        parser.parseString(html, root);
        assertTrue(root.hasChildNodes());
    }

}